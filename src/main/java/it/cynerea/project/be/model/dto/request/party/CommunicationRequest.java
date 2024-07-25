package it.cynerea.project.be.model.dto.request.party;

import java.util.UUID;

public record CommunicationRequest(
        String playerId,
        Boolean isPin,
        String text
) {
}