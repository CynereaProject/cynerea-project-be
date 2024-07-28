package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;


public record DiscussionResponse(
        String id,
        BoardResponse board,
        PlayerResponse player,
        Timestamp date,
        String text
) {
}