package it.cynerea.project.be.service;

import it.cynerea.project.be.error.NotFoundException;
import it.cynerea.project.be.mapper.AwakeningMapper;
import it.cynerea.project.be.model.dao.Awakening;
import it.cynerea.project.be.model.dao.id.AwakeningSkillId;
import it.cynerea.project.be.model.dao.relation.AwakeningSkill;
import it.cynerea.project.be.model.dto.request.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.AwakeningResponse;
import it.cynerea.project.be.repo.AwakeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AwakeningService {

    @Autowired
    private AwakeningRepository awakeningRepository;

    @Autowired
    private AwakeningMapper awakeningMapper;

    public void create(AwakeningRequest request) {
        Awakening newAwakening = awakeningMapper.requestToDao(request);
        awakeningRepository.save(newAwakening);
    }

    public void update(Integer id, AwakeningRequest request) {
        Awakening awakening = findById(id);
        awakening.setName(request.name());
        awakening.setDescription(request.description());
        awakening.setImg(request.img());
        awakeningRepository.save(awakening);
    }

    public AwakeningResponse getById(Integer id) {
        Awakening awakening = findById(id);
        return awakeningMapper.daoToResponse(awakening);
    }

    public void delete(Integer id) {
        awakeningRepository.deleteById(id);
    }

    protected Awakening findById(Integer id) {
        Optional<Awakening> optionalAwakening = awakeningRepository.findById(id);
        if(optionalAwakening.isPresent())
            return optionalAwakening.get();
        else
            throw new NotFoundException();
    }

}
