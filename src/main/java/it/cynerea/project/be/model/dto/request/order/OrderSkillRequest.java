package it.cynerea.project.be.model.dto.request.order;

public record OrderSkillRequest(
        Long orderId, //CUSTOM MAPPER LONG_TO_ORDER
        Long skillId, //CUSTOM MAPPER LONG_TO_SKILL
        Integer unlockLevel
) {
}