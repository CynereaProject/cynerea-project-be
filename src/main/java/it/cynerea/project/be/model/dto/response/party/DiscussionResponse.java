package it.cynerea.project.be.model.dto.response.party;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

public record DiscussionResponse(
        String id,
        PartyPlayerResponse player,
        Timestamp date,
        String text
) {
}