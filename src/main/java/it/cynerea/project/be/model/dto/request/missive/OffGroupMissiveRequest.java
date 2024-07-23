package it.cynerea.project.be.model.dto.request.missive;

import java.util.UUID;

public record OffGroupMissiveRequest(
        UUID senderId,
        String groupName,
        String title,
        String text
) {
}