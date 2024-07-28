package it.cynerea.project.be.model.dto.response.awakening;

import java.util.Set;


public record AwakeningResponse(
        Long id,
        String name,
        String description,
        String img,
        Set<AwakeningSkillResponse> skills
) {
}