package it.cynerea.project.be.model.dto.response.awakening;


import it.cynerea.project.be.model.dto.response.skill.SkillResponse;

public record AwakeningSkillResponse(
        SkillResponse skill,
        Integer awakeningDegreeRequest
) {
}