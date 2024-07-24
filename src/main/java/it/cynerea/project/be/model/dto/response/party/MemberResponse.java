package it.cynerea.project.be.model.dto.response.party;

public record MemberResponse(
        PartyPlayerResponse id,
        String role,
        String img,
        Boolean isBoss
) {
}