package it.cynerea.project.be.model.dto.request.system;

import it.cynerea.project.be.model.enums.PlayerLogType;

import java.util.UUID;

public record PlayerLogRequest(
        UUID targetId,
        String cause,
        PlayerLogType type
) {
}