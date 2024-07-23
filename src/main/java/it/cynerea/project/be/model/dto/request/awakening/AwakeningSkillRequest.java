package it.cynerea.project.be.model.dto.request.awakening;

public record AwakeningSkillRequest(
        Long skillId,
        Integer awakeningDegreeRequest
) {
}