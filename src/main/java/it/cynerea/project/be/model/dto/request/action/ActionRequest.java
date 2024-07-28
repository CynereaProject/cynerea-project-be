package it.cynerea.project.be.model.dto.request.action;

import it.cynerea.project.be.model.dto.request.embedded.ResistancesRequest;
import it.cynerea.project.be.model.dto.request.embedded.StatsRequest;
import it.cynerea.project.be.model.enums.ActionType;

import java.util.Set;

public record ActionRequest(
        //String id, GENERATE
        //CharacterRequest character, OBTAIN TO TOKEN
        //Timestamp date, GENERATE
        ActionType type,
        String text,
        StatsRequest modifierStats,
        ResistancesRequest modifierResistances,
        Set<Long> skills //CUSTOM MAPPER LONG_TO_SKILL
) {
}