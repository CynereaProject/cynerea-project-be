package it.cynerea.project.be.model.dto.response.chat.id;

import it.cynerea.project.be.model.dto.response.chat.ChatResponse;
import it.cynerea.project.be.model.dto.response.party.PartyResponse;

public record InfluenceIdResponse(
        ChatResponse chat,
        PartyResponse party
) {
}