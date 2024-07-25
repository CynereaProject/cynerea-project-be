package it.cynerea.project.be.model.dto.response.action;

import it.cynerea.project.be.model.dto.response.common.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.common.StatsResponse;
import it.cynerea.project.be.model.enums.ActionType;

import java.sql.Date; 
import java.util.Set;
import java.util.UUID;

public record ActionResponse(
        String id,
        ActionCharacterResponse character,
        Date date,
        ActionType type,
        String text,
        StatsResponse modifierStats,
        ResistancesResponse modifierResistances,
        Set<ActionSkillResponse> skills
) {
}