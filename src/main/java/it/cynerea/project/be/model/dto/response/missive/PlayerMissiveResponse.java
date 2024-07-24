package it.cynerea.project.be.model.dto.response.missive;

import java.util.UUID;

public record PlayerMissiveResponse(
   UUID id,
   String username
) {}
