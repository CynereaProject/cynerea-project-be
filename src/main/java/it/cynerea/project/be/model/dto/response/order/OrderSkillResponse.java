package it.cynerea.project.be.model.dto.response.order;

import it.cynerea.project.be.model.dto.response.order.id.OrderSkillIdResponse;


public record OrderSkillResponse(
        OrderSkillIdResponse id,
        Integer unlockLevel
) {
}