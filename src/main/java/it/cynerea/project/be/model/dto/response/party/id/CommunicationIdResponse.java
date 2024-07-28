package it.cynerea.project.be.model.dto.response.party.id;

import it.cynerea.project.be.model.dto.response.party.PartyResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;

public record CommunicationIdResponse(
        PartyResponse party,
        PlayerResponse player,
        Timestamp date
) {
}