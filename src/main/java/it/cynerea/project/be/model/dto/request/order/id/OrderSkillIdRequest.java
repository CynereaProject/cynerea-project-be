package it.cynerea.project.be.model.dto.request.order.id;

public record OrderSkillIdRequest(
        Long orderId, //CUSTOM MAPPER LONG_TO_ORDER
        Long skillId //CUSTOM MAPPER LONG_TO_SKILL
) {
}