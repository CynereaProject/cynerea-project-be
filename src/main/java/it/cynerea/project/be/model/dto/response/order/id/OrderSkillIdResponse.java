package it.cynerea.project.be.model.dto.response.order.id;

import it.cynerea.project.be.model.dto.response.order.OrderResponse;
import it.cynerea.project.be.model.dto.response.skill.SkillResponse;

public record OrderSkillIdResponse(
        OrderResponse order,
        SkillResponse skill
) {
}