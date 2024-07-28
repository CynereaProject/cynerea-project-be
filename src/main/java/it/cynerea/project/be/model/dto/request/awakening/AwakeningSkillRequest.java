package it.cynerea.project.be.model.dto.request.awakening;

import it.cynerea.project.be.model.dto.request.awakening.id.AwakeningSkillIdRequest;


public record AwakeningSkillRequest(
        AwakeningSkillIdRequest id,
        Integer awakeningDegreeRequest
) {
}