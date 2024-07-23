package it.cynerea.project.be.model.dto.request.character;

public record CharacterOrderRequest(
        Long orderId,
        Integer level,
        Boolean isExcellence
) {
}