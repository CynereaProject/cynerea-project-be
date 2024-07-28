package it.cynerea.project.be.model.dto.request.character;

public record TraitRequest(
        //Long id, GENERATE
        String name,
        String description,
        String effect,
        String requirements,
        String img
) {
}