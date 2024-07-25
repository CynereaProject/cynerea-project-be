package it.cynerea.project.be.model.dto.response.missive;

import java.sql.Date; 
import java.util.UUID;

public record OffGroupReplyResponse(
        String id,
        PlayerMissiveResponse sender,
        Date date,
        String title,
        String text,
        OffGroupReplyResponse thread
) {
}