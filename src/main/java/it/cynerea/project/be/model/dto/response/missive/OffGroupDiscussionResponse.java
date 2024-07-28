package it.cynerea.project.be.model.dto.response.missive;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;


public record OffGroupDiscussionResponse(
        String id,
        PlayerResponse sender,
        Timestamp date,
        String text,
        OffGroupMissiveResponse offGroupMissive
) {
}