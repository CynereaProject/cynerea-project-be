package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dto.response.character.id.CharacterOrderIdResponse;


public record CharacterOrderDto(
        CharacterOrderIdResponse id,
        Integer level,
        Boolean isExcellence
) {
}