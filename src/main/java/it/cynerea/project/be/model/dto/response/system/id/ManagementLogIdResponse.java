package it.cynerea.project.be.model.dto.response.system.id;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;

public record ManagementLogIdResponse(
        PlayerResponse player,
        String resource,
        Timestamp date
) {
}