package it.cynerea.project.be.model.dto.response.action;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import it.cynerea.project.be.model.dto.response.embedded.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.embedded.StatsResponse;
import it.cynerea.project.be.model.dto.response.skill.SkillResponse;
import it.cynerea.project.be.model.enums.ActionType;

import java.sql.Timestamp;
import java.util.Set;

public record ActionResponse(
        String id,
        CharacterResponse character,
        Timestamp date,
        ActionType type,
        String text,
        StatsResponse modifierStats,
        ResistancesResponse modifierResistances,
        Set<SkillResponse> skills
) {
}