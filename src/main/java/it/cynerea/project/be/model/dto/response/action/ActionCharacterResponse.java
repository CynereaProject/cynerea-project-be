package it.cynerea.project.be.model.dto.response.action;

import java.util.UUID;

public record ActionCharacterResponse(
        UUID id,
        String name
) {
}
