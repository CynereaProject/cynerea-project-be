package it.cynerea.project.be.model.dto.response.party;

import java.sql.Date; 
import java.util.UUID;

public record DiscussionResponse(
        String id,
        PartyPlayerResponse player,
        Date date,
        String text
) {
}