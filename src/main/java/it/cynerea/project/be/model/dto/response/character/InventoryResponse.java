package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dto.response.thing.ThingResponse;

import java.util.UUID;

public record InventoryResponse (
    UUID id,
    ThingResponse thing,
    String customName,
    String customDescription,
    String masterNote,
    Integer quantity
){}