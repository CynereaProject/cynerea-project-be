package it.cynerea.project.be.model.dto.request.master;

import it.cynerea.project.be.model.dto.request.common.ResistancesRequest;
import it.cynerea.project.be.model.dto.request.common.StatsRequest;

import java.util.Set;

public record MonsterRequest(
    String name,
    String description,
    String specieName,
    String img,
    String rankName,
    StatsRequest stats,
    Boolean isHide,
    Integer level,
    ResistancesRequest resistances,
    Set<String> abilitiesId
){}