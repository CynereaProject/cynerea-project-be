package it.cynerea.project.be.mapper.player;


import it.cynerea.project.be.model.dao.player.Group;
import it.cynerea.project.be.model.dao.player.Role;
import it.cynerea.project.be.model.dto.request.player.GroupRequest;
import it.cynerea.project.be.model.dto.request.player.RoleRequest;
import it.cynerea.project.be.model.dto.response.player.GroupResponse;
import it.cynerea.project.be.model.dto.response.player.RoleResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = GroupMapper.class)
public interface RoleMapper {

    @Mapping(source = "groupName", target = "group")
    Role toEntity(RoleRequest request);

    Role stringToEntity(String name);

    RoleResponse toDto(Role entity);

    Set<RoleResponse> entityListToDtoSet(List<Role> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Role partialUpdate(RoleRequest request, @MappingTarget Role entity);
}
