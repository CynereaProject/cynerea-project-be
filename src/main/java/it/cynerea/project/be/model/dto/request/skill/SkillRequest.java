package it.cynerea.project.be.model.dto.request.skill;

import it.cynerea.project.be.model.enums.SkillType;


public record SkillRequest(
        //Long id, GENERATE
        String name,
        String effect,
        String img,
        Integer maxLevel,
        Integer manaCost,
        Integer healthCost,
        SkillType type,
        Integer duration
) {
}