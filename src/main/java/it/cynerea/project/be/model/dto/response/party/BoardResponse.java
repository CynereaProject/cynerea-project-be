package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;
import java.util.Set;


public record BoardResponse(
        String id,
        PartyResponse party,
        PlayerResponse player,
        Timestamp date,
        String title,
        String text,
        Set<DiscussionResponse> discussion
) {
}