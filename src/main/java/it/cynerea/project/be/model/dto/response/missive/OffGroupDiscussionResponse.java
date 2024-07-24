package it.cynerea.project.be.model.dto.response.missive;

import java.time.Instant;
import java.util.UUID;

public record OffGroupDiscussionResponse (
    UUID id,
    PlayerMissiveResponse sender,
    Instant date,
    String text
){}