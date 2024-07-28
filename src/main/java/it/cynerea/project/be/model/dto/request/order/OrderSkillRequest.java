package it.cynerea.project.be.model.dto.request.order;

import it.cynerea.project.be.model.dto.request.order.id.OrderSkillIdRequest;


public record OrderSkillRequest(
        OrderSkillIdRequest id,
        Integer unlockLevel
) {
}