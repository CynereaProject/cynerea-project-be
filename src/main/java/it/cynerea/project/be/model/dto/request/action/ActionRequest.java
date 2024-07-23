package it.cynerea.project.be.model.dto.request.action;

import it.cynerea.project.be.model.dto.request.common.ResistancesRequest;
import it.cynerea.project.be.model.dto.request.common.StatsRequest;

import java.util.Set;
import java.util.UUID;

public record ActionRequest(
        UUID characterId,
        Boolean isReport,
        String text,
        StatsRequest modifierStats,
        ResistancesRequest modifierResistances,
        Set<Long> skillsId
) {
}