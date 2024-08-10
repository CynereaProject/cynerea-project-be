package it.cynerea.project.be.mapper.player;


import it.cynerea.project.be.model.dao.player.Role;
import it.cynerea.project.be.model.dao.player.Trophy;
import it.cynerea.project.be.model.dto.request.player.RoleRequest;
import it.cynerea.project.be.model.dto.request.player.TrophyRequest;
import it.cynerea.project.be.model.dto.response.player.RoleResponse;
import it.cynerea.project.be.model.dto.response.player.TrophyResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TrophyMapper {

    Trophy toEntity(TrophyRequest request);

    Trophy stringToEntity(String name);

    TrophyResponse toDto(Trophy entity);

    Set<TrophyResponse> entityListToDtoSet(List<Trophy> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Trophy partialUpdate(TrophyRequest request, @MappingTarget Trophy entity);
}
