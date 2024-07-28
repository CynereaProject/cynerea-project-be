package it.cynerea.project.be.model.dto.request.race;

import it.cynerea.project.be.model.dto.request.embedded.StatsRequest;

import java.util.Set;


public record RaceRequest(
        //Long id, GENERATE
        String name,
        String description,
        String img,
        StatsRequest stats,
        String nextStepId, //CUSTOM MAPPER STRING_TO_RACE
        Set<Long> skills //CUSTOM MAPPER LONG_TO_SKILL
) {
}