package it.cynerea.project.be.model.dto.response.channel;

import java.time.Instant;
import java.util.UUID;

public record MessageResponse (
    UUID id,
    Instant sendDate,
    Boolean isPin,
    MessagePlayerResponse player,
    String text
){}