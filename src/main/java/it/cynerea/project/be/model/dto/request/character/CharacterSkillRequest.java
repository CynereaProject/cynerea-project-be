package it.cynerea.project.be.model.dto.request.character;

public record CharacterSkillRequest(
        Long skillId,
        Integer level
) {
}