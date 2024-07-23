package it.cynerea.project.be.model.dto.request.missive;

import java.util.UUID;

public record OffMissiveRequest(
    UUID senderId,
    UUID recipientId,
    String title,
    String text,
    UUID threadId
){}