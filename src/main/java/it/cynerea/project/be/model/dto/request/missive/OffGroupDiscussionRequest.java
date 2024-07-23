package it.cynerea.project.be.model.dto.request.missive;

import java.time.Instant;
import java.util.UUID;

public record OffGroupDiscussionRequest(
        UUID senderId,
        Instant date,
        String text,
        UUID offGroupMissiveId
) {
}