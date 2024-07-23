package it.cynerea.project.be.model.dto.request.party;

import java.util.UUID;

public record DiscussionRequest(
        UUID boardId,
        UUID playerId,
        String text
) {
}