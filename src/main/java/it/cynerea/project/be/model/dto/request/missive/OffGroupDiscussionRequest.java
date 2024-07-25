package it.cynerea.project.be.model.dto.request.missive;

import java.sql.Date; 
import java.util.UUID;

public record OffGroupDiscussionRequest(
        String senderId,
        String text,
        String offGroupMissiveId
) {
}