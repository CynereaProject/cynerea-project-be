package it.cynerea.project.be.model.dto.request.channel;

import java.util.UUID;


public record MessageRequest(
        Boolean isPin,
        String playerId,
        String text
) {
}