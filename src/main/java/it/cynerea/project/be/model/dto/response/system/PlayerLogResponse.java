package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.enums.PlayerLogType;

import java.sql.Date;
import java.sql.Timestamp;

public record PlayerLogResponse(
        LogPlayerResponse player,
        LogPlayerResponse target,
        Timestamp date,
        String cause,
        PlayerLogType type
) {
}