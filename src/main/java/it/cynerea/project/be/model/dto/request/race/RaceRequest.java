package it.cynerea.project.be.model.dto.request.race;

import it.cynerea.project.be.model.dto.request.common.StatsRequest;

public record RaceRequest(
        String name,
        String description,
        String img,
        StatsRequest stats,
        Long nextStepId
) {
}