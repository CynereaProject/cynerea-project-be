package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.dto.response.system.id.PlayerLogIdResponse;
import it.cynerea.project.be.model.enums.PlayerLogType;


public record PlayerLogResponse(
        PlayerLogIdResponse id,
        String cause,
        PlayerLogType type
) {
}