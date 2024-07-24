package it.cynerea.project.be.model.dto.response.race;

import it.cynerea.project.be.model.dto.response.common.StatsResponse;
import it.cynerea.project.be.model.dto.response.skill.SkillResponse;

import java.util.Set;

public record RaceResponse(
        Long id,
        String name,
        String description,
        String img,
        StatsResponse stats,
        RaceResponse nextStep,
        Set<SkillResponse> skills
) {
}