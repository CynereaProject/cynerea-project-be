package it.cynerea.project.be.model.dto.request.party;

import java.util.UUID;

public record BoardRequest(
        String partyName,
        UUID player,
        String title,
        String text
) {
}