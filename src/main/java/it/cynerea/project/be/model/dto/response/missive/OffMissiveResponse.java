package it.cynerea.project.be.model.dto.response.missive;

import java.sql.Date; 
import java.util.UUID;

public record OffMissiveResponse(
        String id,
        PlayerMissiveResponse sender,
        PlayerMissiveResponse recipient,
        Date date,
        String title,
        String text,
        OffMissiveResponse thread
) {
}