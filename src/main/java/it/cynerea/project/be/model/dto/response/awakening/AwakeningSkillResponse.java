package it.cynerea.project.be.model.dto.response.awakening;

import it.cynerea.project.be.model.dto.response.awakening.id.AwakeningSkillIdResponse;


public record AwakeningSkillResponse(
        AwakeningSkillIdResponse id,
        Integer awakeningDegreeRequest
) {
}