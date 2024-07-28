package it.cynerea.project.be.model.dto.request.awakening.id;

public record AwakeningSkillIdRequest(
        Long awakeningId, //CUSTOM MAPPER LONG_TO_AWAKENING
        Long skillId//CUSTOM MAPPER LONG_TO_SKILL
) {
}