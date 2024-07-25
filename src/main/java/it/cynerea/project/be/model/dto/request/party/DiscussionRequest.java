package it.cynerea.project.be.model.dto.request.party;

import java.util.UUID;

public record DiscussionRequest(
        String boardId,
        String playerId,
        String text
) {
}