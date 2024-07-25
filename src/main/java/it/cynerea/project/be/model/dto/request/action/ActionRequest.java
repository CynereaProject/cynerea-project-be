package it.cynerea.project.be.model.dto.request.action;

import it.cynerea.project.be.model.dto.request.common.ResistancesRequest;
import it.cynerea.project.be.model.dto.request.common.StatsRequest;
import it.cynerea.project.be.model.enums.ActionType;

import java.util.Set;
import java.util.UUID;

public record ActionRequest(
        String characterId,
        ActionType type,
        String text,
        StatsRequest modifierStats,
        ResistancesRequest modifierResistances,
        Set<Long> skillsId
) {
}