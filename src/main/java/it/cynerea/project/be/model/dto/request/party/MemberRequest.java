package it.cynerea.project.be.model.dto.request.party;

import java.util.UUID;

public record MemberRequest(
        String characterId,
        String role,
        String img,
        Boolean isBoss
) {
}