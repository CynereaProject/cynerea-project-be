package it.cynerea.project.be.mapper.player;


import it.cynerea.project.be.model.dao.player.Group;
import it.cynerea.project.be.model.dto.request.player.GroupRequest;
import it.cynerea.project.be.model.dto.response.player.GroupResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = RoleMapper.class)
public interface GroupMapper {

    Group toEntity(GroupRequest request);

    Group stringToEntity(String name);

    GroupResponse toDto(Group entity);

    Set<GroupResponse> entityListToDtoSet(List<Group> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Group partialUpdate(GroupRequest request, @MappingTarget Group entity);
}
