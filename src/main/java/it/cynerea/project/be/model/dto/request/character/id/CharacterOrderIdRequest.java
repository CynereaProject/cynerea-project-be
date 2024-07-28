package it.cynerea.project.be.model.dto.request.character.id;

public record CharacterOrderIdRequest(
        //CharacterDto character, OBTAIN TO TOKEN
        Long orderId //CUSTOM MAPPER LONG_TO_ORDER
) {
}