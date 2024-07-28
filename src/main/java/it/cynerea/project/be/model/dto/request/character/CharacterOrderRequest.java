package it.cynerea.project.be.model.dto.request.character;

public record CharacterOrderRequest(
        //CharacterDto character, OBTAIN TO TOKEN
        Long orderId, //CUSTOM MAPPER LONG_TO_ORDER
        Integer level,
        Boolean isExcellence
) {
}