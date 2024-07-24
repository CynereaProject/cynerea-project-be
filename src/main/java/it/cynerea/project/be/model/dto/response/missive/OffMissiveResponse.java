package it.cynerea.project.be.model.dto.response.missive;

import java.time.Instant;
import java.util.UUID;

public record OffMissiveResponse(
        UUID id,
        PlayerMissiveResponse sender,
        PlayerMissiveResponse recipient,
        Instant date,
        String title,
        String text,
        OffMissiveResponse thread
) {
}