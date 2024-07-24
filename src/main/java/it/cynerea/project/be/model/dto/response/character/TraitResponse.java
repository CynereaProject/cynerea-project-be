package it.cynerea.project.be.model.dto.response.character;

public record TraitResponse(
        Long id,
        String name,
        String description,
        String effect,
        String requirements,
        String img
) {
}