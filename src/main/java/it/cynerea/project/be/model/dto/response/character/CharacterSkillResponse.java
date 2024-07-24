package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dto.response.skill.SkillResponse;

public record CharacterSkillResponse(
        SkillResponse skill,
        Integer level
) {
}