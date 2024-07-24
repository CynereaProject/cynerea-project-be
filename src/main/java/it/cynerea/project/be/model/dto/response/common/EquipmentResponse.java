package it.cynerea.project.be.model.dto.response.common;

import it.cynerea.project.be.model.dto.response.character.InventoryResponse;

public record EquipmentResponse(
        InventoryResponse leftHand,
        InventoryResponse rightHand,
        InventoryResponse body,
        InventoryResponse accessory1,
        InventoryResponse accessory2,
        InventoryResponse accessory3,
        InventoryResponse accessory4,
        InventoryResponse accessory5
) {
}