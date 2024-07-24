package it.cynerea.project.be.model.dto.response.skill;

import it.cynerea.project.be.model.enums.SkillType;

public record SkillResponse(
        Long id,
        String name,
        String effect,
        String img,
        Integer maxLevel,
        Integer manaCost,
        Integer healthCost,
        SkillType type
) {
}