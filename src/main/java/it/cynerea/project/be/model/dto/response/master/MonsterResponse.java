package it.cynerea.project.be.model.dto.response.master;


import it.cynerea.project.be.model.dto.response.common.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.common.StatsResponse;

import java.util.Set;

public record MonsterResponse (
    Long id,
    String name,
    String description,
    SpecieResponse specie,
    String img,
    RankResponse rank,
    StatsResponse stats,
    Boolean isHide,
    Integer level,
    ResistancesResponse resistances,
    Set<AbilityResponse> abilities
){}