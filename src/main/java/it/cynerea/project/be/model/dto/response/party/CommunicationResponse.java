package it.cynerea.project.be.model.dto.response.party;

import java.time.Instant;


public record CommunicationResponse(
        PartyPlayerResponse player,
        Instant date,
        Boolean isPin,
        String text
) {
}