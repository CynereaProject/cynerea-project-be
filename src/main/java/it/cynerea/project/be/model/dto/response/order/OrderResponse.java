package it.cynerea.project.be.model.dto.response.order;

import java.util.Set;

public record OrderResponse(
        Long id,
        String name,
        String description,
        String img,
        Set<OrderSkillResponse> skills
) {
}