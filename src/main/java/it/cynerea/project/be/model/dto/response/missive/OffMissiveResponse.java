package it.cynerea.project.be.model.dto.response.missive;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;


public record OffMissiveResponse(
        String id,
        PlayerResponse sender,
        PlayerResponse recipient,
        Timestamp date,
        String title,
        String text,
        Boolean isRead,
        OffMissiveResponse thread
) {
}