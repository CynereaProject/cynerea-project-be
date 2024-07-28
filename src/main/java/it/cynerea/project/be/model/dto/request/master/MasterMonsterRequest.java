package it.cynerea.project.be.model.dto.request.master;

public record MasterMonsterRequest(
        //String id, GENERATE
        Long monsterId,//CUSTOM MAPPER LONG_TO_MONSTER
        //PlayerRequest master, OBTAIN BY TOKEN
        String customName,
        //StatsRequest currentStats, EQUALS TO MONSTER STATS
        //ResistancesRequest currentResistances, EQUALS TO MONSTER RESISTANCE
        String questId//CUSTOM MAPPER STRING_TO_QUEST
) {
}