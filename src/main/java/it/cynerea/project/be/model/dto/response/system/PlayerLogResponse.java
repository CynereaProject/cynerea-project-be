package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.enums.PlayerLogType;

import java.time.Instant;

public record PlayerLogResponse(
        LogPlayerResponse player,
        LogPlayerResponse target,
        Instant date,
        String cause,
        PlayerLogType type
) {
}