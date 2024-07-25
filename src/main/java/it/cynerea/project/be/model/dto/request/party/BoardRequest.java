package it.cynerea.project.be.model.dto.request.party;

import java.util.UUID;

public record BoardRequest(
        String partyName,
        String player,
        String title,
        String text
) {
}