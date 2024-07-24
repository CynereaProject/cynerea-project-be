package it.cynerea.project.be.model.dto.response.action;

import it.cynerea.project.be.model.dto.response.common.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.common.StatsResponse;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record ActionResponse (
    UUID id,
    ActionCharacterResponse character,
    Instant date,
    Boolean isReport,
    String text,
    StatsResponse modifierStats,
    ResistancesResponse modifierResistances,
    Set<ActionSkillResponse> skills
){}