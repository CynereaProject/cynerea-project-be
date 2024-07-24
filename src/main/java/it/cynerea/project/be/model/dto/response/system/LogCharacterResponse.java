package it.cynerea.project.be.model.dto.response.system;

import java.util.UUID;

public record LogCharacterResponse(
        UUID id,
        String name
) {
}
