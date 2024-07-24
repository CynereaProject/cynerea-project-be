package it.cynerea.project.be.model.dto.response.party;

import java.time.Instant;
import java.util.UUID;

public record DiscussionResponse(
        UUID id,
        PartyPlayerResponse player,
        Instant date,
        String text
) {
}