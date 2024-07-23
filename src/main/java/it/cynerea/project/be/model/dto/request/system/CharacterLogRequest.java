package it.cynerea.project.be.model.dto.request.system;

import it.cynerea.project.be.model.enums.CharacterLogType;

import java.util.UUID;

public record CharacterLogRequest(
        UUID characterId,
        String cause,
        CharacterLogType type
) {
}