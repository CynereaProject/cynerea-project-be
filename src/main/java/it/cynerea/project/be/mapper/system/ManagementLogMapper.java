package it.cynerea.project.be.mapper.system;

import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.ManagementLog;
import it.cynerea.project.be.model.enums.ManagementLogType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ManagementLogMapper {

    @Mapping(source = "player", target = "id.player")
    @Mapping(source = "resource", target = "id.resource")
    ManagementLog requestToDao(Player player, String resource, ManagementLogType type);
}
