package it.cynerea.project.be.mapper.system;

import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.PlayerLog;
import it.cynerea.project.be.model.enums.PlayerLogType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlayerLogMapper {

    @Mapping(source = "player", target = "id.player")
    @Mapping(source = "target", target = "id.target")
    PlayerLog requestToDao(Player player, Player target, String cause, PlayerLogType type);
}
