package it.cynerea.project.be.mapper.system;

import it.cynerea.project.be.model.dao.system.Token;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface TokenMapper {

    @Mapping(ignore = true, target = "token")
    @Mapping(source = "playerId", target = "player.id")
    Token requestToDao(String playerId);
}
