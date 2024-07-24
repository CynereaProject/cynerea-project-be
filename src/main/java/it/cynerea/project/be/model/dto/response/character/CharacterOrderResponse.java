package it.cynerea.project.be.model.dto.response.character;

public record CharacterOrderResponse(
        Long id,
        String name,
        String img,
        Integer level,
        Boolean isExcellence
) {
}
