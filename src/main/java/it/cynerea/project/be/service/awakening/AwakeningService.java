package it.cynerea.project.be.service.awakening;

import it.cynerea.project.be.exception.NotFoundException;
import it.cynerea.project.be.mapper.awakening.AwakeningMapper;
import it.cynerea.project.be.model.dao.awakening.Awakening;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.awakening.AwakeningResponse;
import it.cynerea.project.be.repository.awakening.AwakeningRepository;
import it.cynerea.project.be.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
public class AwakeningService implements BaseService<AwakeningRequest, AwakeningResponse, Long> {

    @Autowired
    private AwakeningRepository awakeningRepository;
    @Autowired
    private AwakeningMapper awakeningMapper;

    @Override
    public void create(AwakeningRequest request, Player user) {
        Awakening awakening = awakeningMapper.requestToDao(request);
        awakeningRepository.save(awakening);
    }

    @Override
    public AwakeningResponse readById(Long id, Player user) {
        Optional<Awakening> optional = awakeningRepository.findById(id);
        if (optional.isPresent()) {
            return awakeningMapper.daoToResponse(optional.get());
        } else {
            throw new NotFoundException("awakening", id.toString());
        }
    }

    @Override
    public Set<AwakeningResponse> readAll(Player user) {
        List<Awakening> awakeningList = awakeningRepository.findAll();
        return awakeningMapper.daoListToResponseSet(awakeningList);
    }

    @Override
    public void update(Long id, AwakeningRequest request, Player user) {
        Optional<Awakening> optional = awakeningRepository.findById(id);
        if (optional.isPresent()) {
            Awakening awakening = optional.get();
            if(Objects.nonNull(request.name()))
                awakening.setName(request.name());
            if(Objects.nonNull(request.description()))
                awakening.setDescription(request.description());
            if(Objects.nonNull(request.img()))
                awakening.setImg(request.img());
        } else {
            throw new NotFoundException("awakening", id.toString());
        }
    }

    @Override
    public void delete(Long id, Player user) {

    }
}
