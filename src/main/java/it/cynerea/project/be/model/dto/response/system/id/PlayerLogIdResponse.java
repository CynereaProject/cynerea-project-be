package it.cynerea.project.be.model.dto.response.system.id;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;

public record PlayerLogIdResponse(
        PlayerResponse player,
        PlayerResponse target,
        Timestamp date
) {
}