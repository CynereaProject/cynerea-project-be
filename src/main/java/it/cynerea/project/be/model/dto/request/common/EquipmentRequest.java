package it.cynerea.project.be.model.dto.request.common;

import it.cynerea.project.be.model.dao.character.Inventory;


public record EquipmentRequest(
        Inventory leftHand,
        Inventory rightHand,
        Inventory body,
        Inventory accessory1,
        Inventory accessory2,
        Inventory accessory3,
        Inventory accessory4,
        Inventory accessory5
) {
}