package it.cynerea.project.be.model.dto.request.party.id;

public record MemberIdRequest(
        String characterId,//CUSTOM MAPPER STRING_TO_CHARACTER
        String partyName//CUSTOM MAPPER STRING_TO_PARTY
) {
}