package it.cynerea.project.be.mapper.thing;


import it.cynerea.project.be.model.dao.thing.Thing;
import it.cynerea.project.be.model.dto.request.thing.ThingRequest;
import it.cynerea.project.be.model.dto.response.thing.ThingResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {AttributeMapper.class, ThingSubtypeMapper.class})
public interface ThingMapper {

    Thing toEntity(ThingRequest request);

    ThingResponse toDto(Thing entity);

    Set<ThingResponse> entityListToDtoSet(List<Thing> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Thing partialUpdate(ThingRequest request, @MappingTarget Thing entity);
}
