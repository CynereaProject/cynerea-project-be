package it.cynerea.project.be.service;

import it.cynerea.project.be.error.BadRequestException;
import it.cynerea.project.be.error.NotFoundException;
import it.cynerea.project.be.mapper.AttributeMapper;
import it.cynerea.project.be.model.dao.Attribute;
import it.cynerea.project.be.model.dto.request.AttributeRequest;
import it.cynerea.project.be.model.dto.response.AttributeResponse;
import it.cynerea.project.be.repo.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
public class AttributeService {
    @Autowired
    private AttributeRepository attributeRepository;

    @Autowired
    private AttributeMapper attributeMapper;

    public void create(AttributeRequest request) {
        validateRequest(request);
        Attribute attribute = attributeMapper.requestToDao(request);
        attributeRepository.save(attribute);
    }

    public void update(Integer id, AttributeRequest request) {
        validateRequest(request);
        Attribute attribute = findById(id);
        attribute.setName(request.name());
        attribute.setDescription(request.description());
        attributeRepository.save(attribute);
    }

    public AttributeResponse getById(Integer id) {
        Attribute attribute = findById(id);
        return attributeMapper.daoToResponse(attribute);
    }

    public Set<AttributeResponse> getAll() {
        return  attributeMapper.daoListToResponseSet(attributeRepository.findAll());
    }

    public void delete(Integer id) {
        attributeRepository.deleteById(id);
    }

    protected Attribute findById(Integer id){
        Optional<Attribute> optionalAttribute = attributeRepository.findById(id);
        if(optionalAttribute.isPresent())
            return optionalAttribute.get();
        else
            throw new NotFoundException("Attributo non trovato!");
    }

    private void validateRequest(AttributeRequest request){
        if(Objects.isNull(request))
            throw new BadRequestException("Request is null!");
        if(Objects.isNull(request.name()))
            throw new BadRequestException("Name is null!");
        if(Objects.isNull(request.description()))
            throw new BadRequestException("Description is null!");
    }


}
