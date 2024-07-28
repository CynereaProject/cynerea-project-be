package it.cynerea.project.be.model.dto.request.character;

import it.cynerea.project.be.model.enums.Gender;


public record CharacterRequest(
        //String id, GENERATE
        String name,
        String surname,
        //String nickname, NULL
        //String title, NULL
        Gender gender,
        //Integer level, 0
        //Long experience, 0
        //Long coin, 0
        //Integer prestige, 0
        String avatar,
        //String description, NULL
        //String masterNote, NULL
        //String guideNote, NULL
        //String rumors, NULL
        //Date creationDate, GENERATE
        //Date lastActionDate, NULL
        //Boolean isFrozen, FALSE
        //StatsDto stats, BASE ON RACE
        //StatsDto currentStats, EQUAL TO STATS
        //ResistancesDto resistances, DEFAULT
        //ResistancesDto currentResistances, EQUALS TO RESISTANCE
        //EquipmentDto equipment, ALL NULL
        //Set<CharacterLogDto> log, NULL
        //Set<InventoryDto> inventory, NULL
        //Set<MemberDto> memberOf,NULL
        //AwakeningRequest awakening, NULL
        //Integer awakeningDegree, NULL
        //////PlayerDto player, OBTAIN TO TOKEN
        //BlessingDto blessing, NULL
        //TraitDto trait, NULL
        //Set<OnMissiveDto> missivesSend, NULL
        //Set<OnMissiveDto> missivesReceive, NULL
        //Set<CharacterOrderRequest> characterOrders, NULL
        //Set<CharacterSkillDto> skills, NULL
        Long race//CUSTOM MAPPER LONG_TO_RACE
) {
}