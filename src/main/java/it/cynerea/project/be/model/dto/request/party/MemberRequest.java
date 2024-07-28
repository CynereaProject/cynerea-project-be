package it.cynerea.project.be.model.dto.request.party;

public record MemberRequest(
        String characterId,//CUSTOM MAPPER STRING_TO_CHARACTER
        String partyName,//CUSTOM MAPPER STRING_TO_PARTY
        String role,
        String img,
        Boolean isBoss
) {
}