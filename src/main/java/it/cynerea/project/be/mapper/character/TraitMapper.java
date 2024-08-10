package it.cynerea.project.be.mapper.character;


import it.cynerea.project.be.model.dao.character.Trait;
import it.cynerea.project.be.model.dto.request.character.TraitRequest;
import it.cynerea.project.be.model.dto.response.character.TraitResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TraitMapper {

    Trait toEntity(TraitRequest request);

    TraitResponse toDto(Trait entity);

    Set<TraitResponse> entityListToDtoSet(List<Trait> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Trait partialUpdate(TraitRequest request, @MappingTarget Trait entity);
}
