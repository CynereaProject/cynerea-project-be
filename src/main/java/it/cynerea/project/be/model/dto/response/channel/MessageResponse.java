package it.cynerea.project.be.model.dto.response.channel;

import java.sql.Date; 
import java.util.UUID;

public record MessageResponse(
        String id,
        Date sendDate,
        Boolean isPin,
        MessagePlayerResponse player,
        String text
) {
}