package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.enums.CharacterLogType;

import java.sql.Timestamp;

public record CharacterLogResponse(
        LogPlayerResponse player,
        LogCharacterResponse character,
        Timestamp date,
        String cause,
        CharacterLogType type
) {
}