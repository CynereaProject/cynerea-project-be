package it.cynerea.project.be.model.dto.response.awakening.id;

import it.cynerea.project.be.model.dto.response.awakening.AwakeningResponse;
import it.cynerea.project.be.model.dto.response.skill.SkillResponse;

public record AwakeningSkillIdResponse(
        AwakeningResponse awakening,
        SkillResponse skill
) {
}