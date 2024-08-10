package it.cynerea.project.be.mapper.thing;


import it.cynerea.project.be.model.dao.thing.Attribute;
import it.cynerea.project.be.model.dto.request.thing.AttributeRequest;
import it.cynerea.project.be.model.dto.response.thing.AttributeResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AttributeMapper {

    Attribute toEntity(AttributeRequest request, String name);

    Attribute stringToEntity(String name);

    AttributeResponse toDto(Attribute entity);

    Set<AttributeResponse> entityListToDtoSet(List<Attribute> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Attribute partialUpdate(AttributeRequest request, @MappingTarget Attribute entity);
}
