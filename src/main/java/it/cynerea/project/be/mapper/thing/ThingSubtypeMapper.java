package it.cynerea.project.be.mapper.thing;


import it.cynerea.project.be.model.dao.thing.ThingSubtype;
import it.cynerea.project.be.model.dto.request.thing.ThingSubtypeRequest;
import it.cynerea.project.be.model.dto.response.thing.ThingSubtypeResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ThingSubtypeMapper {

    ThingSubtype toEntity(ThingSubtypeRequest request, String name);

    ThingSubtype stringToEntity(String name);

    ThingSubtypeResponse toDto(ThingSubtype entity);

    Set<ThingSubtypeResponse> entityListToDtoSet(List<ThingSubtype> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ThingSubtype partialUpdate(ThingSubtypeRequest request, @MappingTarget ThingSubtype entity);
}
