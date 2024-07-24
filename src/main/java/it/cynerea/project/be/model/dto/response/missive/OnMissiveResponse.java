package it.cynerea.project.be.model.dto.response.missive;

import java.time.Instant;
import java.util.UUID;

public record OnMissiveResponse(
        UUID id,
        CharacterMissiveResponse sender,
        CharacterMissiveResponse recipient,
        Instant date,
        String title,
        String text,
        OnMissiveResponse thread
) {
}