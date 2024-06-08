package it.cynerea.project.be.service;

import it.cynerea.project.be.error.BadRequestException;
import it.cynerea.project.be.error.NotFoundException;
import it.cynerea.project.be.mapper.AwakeningMapper;
import it.cynerea.project.be.model.dao.Awakening;
import it.cynerea.project.be.model.dto.request.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.AwakeningResponse;
import it.cynerea.project.be.repo.AwakeningRepository;
import it.cynerea.project.be.validation.DtoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import static it.cynerea.project.be.costant.ImageUrlDefault.AWAKENING_URL;

@Service
public class AwakeningService {

    @Autowired
    private AwakeningRepository awakeningRepository;

    @Autowired
    private AwakeningMapper awakeningMapper;

    @Autowired
    private DtoValidator validator;

    public void create(AwakeningRequest request) {
        validator.validate(request);
        Awakening awakening = awakeningMapper.requestToDao(request);
        if(Objects.isNull(awakening.getImg()))
            awakening.setImg(AWAKENING_URL);
        awakeningRepository.save(awakening);
    }

    public void update(Integer id, AwakeningRequest request) {
        validator.validate(request);
        Awakening awakening = findById(id);
        awakening.setName(request.name());
        awakening.setDescription(request.description());
        if(Objects.nonNull(request.img()))
            awakening.setImg(request.img());
        else
            awakening.setImg(AWAKENING_URL);
        awakeningRepository.save(awakening);
    }

    public AwakeningResponse getById(Integer id) {
        Awakening awakening = findById(id);
        return awakeningMapper.daoToResponse(awakening);
    }

    public Set<AwakeningResponse> getAll() {
        return awakeningMapper.daoListToResponseSet(awakeningRepository.findAll());
    }

    public void delete(Integer id) {
        awakeningRepository.deleteById(id);
    }

    protected Awakening findById(Integer id) {
        Optional<Awakening> optionalAwakening = awakeningRepository.findById(id);
        if(optionalAwakening.isPresent())
            return optionalAwakening.get();
        else
            throw new NotFoundException("Risveglio non trovato!");
    }

    private void validateRequest(AwakeningRequest request){
        if(Objects.isNull(request))
            throw new BadRequestException("Request is null!");
        if(Objects.isNull(request.name()))
            throw new BadRequestException("Name is null!");
        if(Objects.isNull(request.description()))
            throw new BadRequestException("Description is null!");
    }

}
