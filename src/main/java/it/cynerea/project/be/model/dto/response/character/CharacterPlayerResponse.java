package it.cynerea.project.be.model.dto.response.character;

import java.util.UUID;

public record CharacterPlayerResponse(
   UUID id,
   String username
) {}
