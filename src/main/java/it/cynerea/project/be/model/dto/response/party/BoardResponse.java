package it.cynerea.project.be.model.dto.response.party;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record BoardResponse(
        UUID id,
        PartyPlayerResponse player,
        Instant date,
        String title,
        String text,
        Set<DiscussionResponse> discussion
) {
}