package it.cynerea.project.be.model.dto.request.party;

import it.cynerea.project.be.model.dto.request.party.id.CommunicationIdRequest;


public record CommunicationRequest(
        CommunicationIdRequest id,
        Boolean isPin,
        String text
) {
}