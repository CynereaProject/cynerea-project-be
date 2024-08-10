package it.cynerea.project.be.mapper.embedded;


import it.cynerea.project.be.model.dao.embedded.Resistances;
import it.cynerea.project.be.model.dto.request.common.ResistancesRequest;
import it.cynerea.project.be.model.dto.response.common.ResistancesResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ResistancesMapper {

    Resistances toEntity(ResistancesRequest request);

    ResistancesResponse toDto(Resistances entity);

    Set<ResistancesResponse> entityListToDtoSet(List<Resistances> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Resistances partialUpdate(ResistancesRequest request, @MappingTarget Resistances entity);
}
