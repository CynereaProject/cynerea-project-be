package it.cynerea.project.be.model.dto.request.party;

import it.cynerea.project.be.model.dto.request.party.id.MemberIdRequest;


public record MemberRequest(
        MemberIdRequest id,
        String role,
        String img,
        Boolean isBoss
) {
}