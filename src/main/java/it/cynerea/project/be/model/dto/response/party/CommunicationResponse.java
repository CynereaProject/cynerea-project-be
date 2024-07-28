package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dto.response.party.id.CommunicationIdResponse;


public record CommunicationResponse(
        CommunicationIdResponse id,
        Boolean isPin,
        String text
) {
}