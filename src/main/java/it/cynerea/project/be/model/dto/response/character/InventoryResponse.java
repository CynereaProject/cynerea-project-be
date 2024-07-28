package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dto.response.thing.ThingResponse;


public record InventoryResponse(
        String id,
        ThingResponse thing,
        CharacterResponse character,
        String customName,
        String customDescription,
        String masterNote,
        Integer quantity
) {
}