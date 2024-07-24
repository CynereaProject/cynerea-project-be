package it.cynerea.project.be.model.dto.response.missive;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record OffGroupMissiveResponse(
        UUID id,
        PlayerMissiveResponse sender,
        Instant date,
        String title,
        String text,
        Set<OffGroupDiscussionResponse> discussions,
        Set<OffGroupReplyResponse> replies
) {
}