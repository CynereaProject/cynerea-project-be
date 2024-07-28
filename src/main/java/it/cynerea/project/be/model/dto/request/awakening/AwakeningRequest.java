package it.cynerea.project.be.model.dto.request.awakening;

import java.util.Set;


public record AwakeningRequest(
        //Long id, GENERATE
        String name,
        String description,
        String img,
        Set<AwakeningSkillRequest> skills //CUSTOM MAPPER REQUEST_TO_AWAKENING_SKILL
) {
}