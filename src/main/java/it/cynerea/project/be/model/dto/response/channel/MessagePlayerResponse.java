package it.cynerea.project.be.model.dto.response.channel;

import java.util.UUID;

public record MessagePlayerResponse(
   UUID id,
   String username
) {}
