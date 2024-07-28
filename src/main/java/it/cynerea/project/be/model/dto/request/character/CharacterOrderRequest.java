package it.cynerea.project.be.model.dto.request.character;

import it.cynerea.project.be.model.dto.request.character.id.CharacterOrderIdRequest;


public record CharacterOrderRequest(
        CharacterOrderIdRequest id,
        Integer level,
        Boolean isExcellence
) {
}