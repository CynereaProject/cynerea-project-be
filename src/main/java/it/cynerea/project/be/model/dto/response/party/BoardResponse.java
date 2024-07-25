package it.cynerea.project.be.model.dto.response.party;

import java.sql.Date; 
import java.util.Set;
import java.util.UUID;

public record BoardResponse(
        String id,
        PartyPlayerResponse player,
        Date date,
        String title,
        String text,
        Set<DiscussionResponse> discussion
) {
}