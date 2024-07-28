package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dto.response.party.id.MemberIdResponse;


public record MemberResponse(
        MemberIdResponse id,
        String role,
        String img,
        Boolean isBoss
) {
}