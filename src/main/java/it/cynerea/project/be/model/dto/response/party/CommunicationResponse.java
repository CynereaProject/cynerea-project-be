package it.cynerea.project.be.model.dto.response.party;

import java.sql.Date;
import java.sql.Timestamp;


public record CommunicationResponse(
        PartyPlayerResponse player,
        Timestamp date,
        Boolean isPin,
        String text
) {
}