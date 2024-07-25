package it.cynerea.project.be.model.dto.response.party;

import java.sql.Date; 


public record CommunicationResponse(
        PartyPlayerResponse player,
        Date date,
        Boolean isPin,
        String text
) {
}