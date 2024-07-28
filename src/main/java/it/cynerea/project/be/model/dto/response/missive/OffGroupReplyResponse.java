package it.cynerea.project.be.model.dto.response.missive;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;


public record OffGroupReplyResponse(
        String id,
        OffGroupMissiveResponse offGroupMissive,
        PlayerResponse sender,
        Timestamp date,
        String title,
        String text,
        Boolean isRead,
        OffGroupReplyResponse thread
) {
}