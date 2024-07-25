package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.enums.PlayerLogType;

import java.sql.Date; 

public record PlayerLogResponse(
        LogPlayerResponse player,
        LogPlayerResponse target,
        Date date,
        String cause,
        PlayerLogType type
) {
}