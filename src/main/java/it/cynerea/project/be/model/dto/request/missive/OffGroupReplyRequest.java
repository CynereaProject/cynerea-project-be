package it.cynerea.project.be.model.dto.request.missive;

import java.util.UUID;

public record OffGroupReplyRequest(
        String offGroupMissiveId,
        String senderId,
        String title,
        String text,
        String threadId
) {
}