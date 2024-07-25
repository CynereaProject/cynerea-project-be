package it.cynerea.project.be.model.dto.response.party;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

public record BoardResponse(
        String id,
        PartyPlayerResponse player,
        Timestamp date,
        String title,
        String text,
        Set<DiscussionResponse> discussion
) {
}