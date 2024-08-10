package it.cynerea.project.be.mapper.player;

<<<<<<< Updated upstream

import it.cynerea.project.be.model.dao.player.Group;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.player.GroupRequest;
import it.cynerea.project.be.model.dto.request.player.PlayerRequest;
import it.cynerea.project.be.model.dto.response.player.GroupResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import org.mapstruct.*;
=======
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.player.PlayerRequest;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import org.mapstruct.Mapper;
>>>>>>> Stashed changes

import java.util.List;
import java.util.Set;

<<<<<<< Updated upstream
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PlayerMapper {

    Player toEntity(PlayerRequest request);

    Player stringToEntity(String id);

    PlayerResponse toDto(Player entity);

    Set<PlayerResponse> entityListToDtoSet(List<Player> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Player partialUpdate(PlayerRequest request, @MappingTarget Player entity);
=======
@Mapper(componentModel = "spring")
public interface PlayerMapper {

    Player requestToDao(PlayerRequest request);

    PlayerResponse daoToResponse(Player player);

    Set<PlayerResponse> daoListToResponseSet(List<Player> playerList);
>>>>>>> Stashed changes
}
