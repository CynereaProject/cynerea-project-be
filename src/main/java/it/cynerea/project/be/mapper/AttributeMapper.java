package it.cynerea.project.be.mapper;


import it.cynerea.project.be.model.dao.Attribute;
import it.cynerea.project.be.model.dto.request.AttributeRequest;
import it.cynerea.project.be.model.dto.response.AttributeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AttributeMapper {

    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    Attribute requestToDao(AttributeRequest request);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "description", source = "description")
    AttributeResponse daoToResponse(Attribute attribute);
}
