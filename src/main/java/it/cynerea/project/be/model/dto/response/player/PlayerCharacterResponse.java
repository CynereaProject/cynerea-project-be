package it.cynerea.project.be.model.dto.response.player;

import java.util.UUID;

public record PlayerCharacterResponse(
        UUID id,
        String name
) {
}
