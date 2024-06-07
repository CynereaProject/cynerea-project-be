package it.cynerea.project.be.service;

import it.cynerea.project.be.error.NotFoundException;
import it.cynerea.project.be.mapper.AttributeMapper;
import it.cynerea.project.be.model.dao.Attribute;
import it.cynerea.project.be.model.dto.request.AttributeRequest;
import it.cynerea.project.be.model.dto.response.AttributeResponse;
import it.cynerea.project.be.repo.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AttributeService {
    @Autowired
    private AttributeRepository attributeRepository;

    @Autowired
    private AttributeMapper attributeMapper;

    public void create(AttributeRequest request) {
        Attribute attribute = attributeMapper.requestToDao(request);
        attributeRepository.save(attribute);
    }

    public void update(Integer id, AttributeRequest request) {
        Attribute attribute = findById(id);
        attribute.setName(request.name());
        attribute.setDescription(request.description());
        attributeRepository.save(attribute);
    }

    public AttributeResponse getById(Integer id) {
        Attribute attribute = findById(id);
        return attributeMapper.daoToResponse(attribute);
    }

    public void delete(Integer id) {
        attributeRepository.deleteById(id);
    }

    protected Attribute findById(Integer id){
        Optional<Attribute> optionalAttribute = attributeRepository.findById(id);
        if(optionalAttribute.isPresent())
            return optionalAttribute.get();
        else
            throw new NotFoundException();
    }
}
