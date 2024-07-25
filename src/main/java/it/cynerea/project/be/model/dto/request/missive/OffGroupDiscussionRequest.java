package it.cynerea.project.be.model.dto.request.missive;

import java.sql.Date; 
import java.util.UUID;

public record OffGroupDiscussionRequest(
        String senderId,
        Date date,
        String text,
        String offGroupMissiveId
) {
}