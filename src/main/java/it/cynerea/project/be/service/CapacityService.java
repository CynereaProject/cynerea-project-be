package it.cynerea.project.be.service;

import it.cynerea.project.be.error.BadRequestException;
import it.cynerea.project.be.error.NotFoundException;
import it.cynerea.project.be.mapper.CapacityMapper;
import it.cynerea.project.be.model.dao.Capacity;
import it.cynerea.project.be.model.dto.request.CapacityRequest;
import it.cynerea.project.be.model.dto.response.CapacityResponse;
import it.cynerea.project.be.repo.CapacityRepository;
import it.cynerea.project.be.validation.DtoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
public class CapacityService {
    @Autowired
    private CapacityRepository capacityRepository;

    @Autowired
    private CapacityMapper capacityMapper;

    @Autowired
    private DtoValidator validator;

    public void create(CapacityRequest request) {
        validator.validate(request);
        Capacity capacity = capacityMapper.requestToDao(request);
        capacityRepository.save(capacity);
    }

    public void update(Integer id, CapacityRequest request) {
        validator.validate(request);
        Capacity capacity = findById(id);
        capacity.setName(request.name());
        capacity.setDescription(request.description());
        capacity.setMaxLevel(request.maxLevel());
        capacityRepository.save(capacity);
    }

    public CapacityResponse getById(Integer id) {
        Capacity capacity = findById(id);
        return capacityMapper.daoToResponse(capacity);
    }

    public Set<CapacityResponse> getAll() {
        return capacityMapper.daoListToResponseSet(capacityRepository.findAll());
    }

    public void delete(Integer id) {
        capacityRepository.deleteById(id);
    }

    protected Capacity findById(Integer id) {
        Optional<Capacity> optionalCapacity = capacityRepository.findById(id);
        if(optionalCapacity.isPresent())
            return optionalCapacity.get();
        else
            throw new NotFoundException("Capacità non trovata!");
    }


}
