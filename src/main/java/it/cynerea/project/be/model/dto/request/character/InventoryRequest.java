package it.cynerea.project.be.model.dto.request.character;

import java.util.UUID;

public record InventoryRequest(
        Long thingId,
        UUID characterId
) {
}