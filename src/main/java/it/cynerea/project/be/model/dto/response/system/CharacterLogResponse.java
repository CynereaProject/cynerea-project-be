package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.dto.response.system.id.CharacterLogIdResponse;
import it.cynerea.project.be.model.enums.CharacterLogType;


public record CharacterLogResponse(
        CharacterLogIdResponse id,
        String cause,
        CharacterLogType type
) {
}