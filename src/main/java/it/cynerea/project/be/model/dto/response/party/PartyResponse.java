package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dto.response.chat.InfluenceResponse;

import java.util.Set;


public record PartyResponse(
        String name,
        String description,
        String img,
        Boolean isGuild,
        Long coin,
        Set<InfluenceResponse> influences,
        Set<CommunicationResponse> communications,
        Set<MemberResponse> members,
        Set<BoardResponse> boards
) {
}