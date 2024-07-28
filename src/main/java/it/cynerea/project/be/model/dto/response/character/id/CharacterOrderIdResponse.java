package it.cynerea.project.be.model.dto.response.character.id;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import it.cynerea.project.be.model.dto.response.order.OrderResponse;

public record CharacterOrderIdResponse(
        CharacterResponse character,
        OrderResponse order
) {
}