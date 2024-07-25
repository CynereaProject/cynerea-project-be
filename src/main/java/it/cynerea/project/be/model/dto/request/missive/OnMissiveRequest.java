package it.cynerea.project.be.model.dto.request.missive;

import java.util.UUID;

public record OnMissiveRequest(
        String senderId,
        String recipientId,
        String title,
        String text,
        String threadId
) {
}