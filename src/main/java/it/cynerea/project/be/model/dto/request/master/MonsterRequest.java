package it.cynerea.project.be.model.dto.request.master;

import it.cynerea.project.be.model.dto.request.embedded.ResistancesRequest;
import it.cynerea.project.be.model.dto.request.embedded.StatsRequest;

import java.util.Set;


public record MonsterRequest(
        //Long id, GENERATE
        String name,
        String description,
        String specieName, //CUSTOM MAPPER STRING_TO_SPECIE
        String img,
        String rankName,//CUSTOM MAPPER STRING_TO_RANK
        StatsRequest stats,
        Boolean isHide,
        Integer level,
        ResistancesRequest resistances,
        Set<String> abilities//CUSTOM MAPPER STRING_TO_ABILITY
) {
}