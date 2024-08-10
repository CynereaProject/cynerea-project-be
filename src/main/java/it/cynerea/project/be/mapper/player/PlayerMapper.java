package it.cynerea.project.be.mapper.player;


import it.cynerea.project.be.model.dao.player.Group;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.player.GroupRequest;
import it.cynerea.project.be.model.dto.request.player.PlayerRequest;
import it.cynerea.project.be.model.dto.response.player.GroupResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import org.mapstruct.*;

import java.util.List;
import java.util.Set;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerMapper {

    Player toEntity(PlayerRequest request);

    Player stringToEntity(String id);

    PlayerResponse toDto(Player entity);

    Set<PlayerResponse> entityListToDtoSet(List<Player> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Player partialUpdate(PlayerRequest request, @MappingTarget Player entity);
}
