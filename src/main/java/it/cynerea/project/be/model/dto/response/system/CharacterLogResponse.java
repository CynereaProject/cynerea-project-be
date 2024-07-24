package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.enums.CharacterLogType;

public record CharacterLogResponse(
    LogPlayerResponse player,
    LogCharacterResponse character,
    Integer date,
    String cause,
    CharacterLogType type
){}