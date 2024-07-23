package it.cynerea.project.be.model.dto.request.character;

public record TraitRequest(
        String name,
        String description,
        String effect,
        String requirements,
        String img
) {
}