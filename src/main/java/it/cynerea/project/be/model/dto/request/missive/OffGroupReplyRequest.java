package it.cynerea.project.be.model.dto.request.missive;

import java.util.UUID;

public record OffGroupReplyRequest(
    UUID offGroupMissiveId,
    UUID senderId,
    String title,
    String text,
    UUID threadId
){}