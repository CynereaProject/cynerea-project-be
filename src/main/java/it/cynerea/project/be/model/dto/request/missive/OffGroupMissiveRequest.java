package it.cynerea.project.be.model.dto.request.missive;

import java.util.UUID;

public record OffGroupMissiveRequest(
        String senderId,
        String groupName,
        String title,
        String text
) {
}