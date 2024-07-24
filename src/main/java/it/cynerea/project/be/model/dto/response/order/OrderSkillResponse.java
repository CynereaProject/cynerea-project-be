package it.cynerea.project.be.model.dto.response.order;

import it.cynerea.project.be.model.dao.skill.Skill;

public record OrderSkillResponse(
        Skill skill,
        Integer unlockLevel
) {
}