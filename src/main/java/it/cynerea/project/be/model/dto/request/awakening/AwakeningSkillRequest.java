package it.cynerea.project.be.model.dto.request.awakening;


public record AwakeningSkillRequest(
        Long awakeningId, //CUSTOM MAPPER LONG_TO_AWAKENING
        Long skillId, //CUSTOM MAPPER LONG_TO_SKILL
        Integer awakeningDegreeRequest
) {
}