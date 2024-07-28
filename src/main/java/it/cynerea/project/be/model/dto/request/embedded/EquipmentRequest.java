package it.cynerea.project.be.model.dto.request.embedded;

import it.cynerea.project.be.model.dto.request.character.InventoryRequest;

public record EquipmentRequest(
        InventoryRequest leftHand,
        InventoryRequest rightHand,
        InventoryRequest body,
        InventoryRequest accessory1,
        InventoryRequest accessory2,
        InventoryRequest accessory3,
        InventoryRequest accessory4,
        InventoryRequest accessory5
) {
}