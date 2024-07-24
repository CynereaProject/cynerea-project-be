package it.cynerea.project.be.model.dto.response.party;

import java.util.UUID;

public record PartyPlayerResponse(
        UUID id,
        String username
) {
}
