package it.cynerea.project.be.model.dto.request.party;

import java.util.UUID;

public record CommunicationRequest(
        UUID playerId,
        Boolean isPin,
        String text
) {
}