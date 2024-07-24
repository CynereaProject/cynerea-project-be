package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dto.response.awakening.AwakeningResponse;
import it.cynerea.project.be.model.dto.response.common.BlessingResponse;
import it.cynerea.project.be.model.dto.response.common.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.common.StatsResponse;
import it.cynerea.project.be.model.enums.Gender;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;


public record CharacterResponse(
        UUID id,
        String name,
        String surname,
        String username,
        String title,
        Gender gender,
        Integer level,
        Long experience,
        Long coin,
        Integer prestige,
        String avatar,
        //String description,
        String masterNote,
        String guideNote,
        Instant creationDate,
        Instant lastActionDate,
        Boolean isFrozen,
        StatsResponse stats,
        StatsResponse currentStats,
        ResistancesResponse resistances,
        ResistancesResponse currentResistances,
        //EquipmentResponse equipment,
        //Set<CharacterLogResponse> log,
        //Set<InventoryResponse> inventory,
        Set<CharacterPartyResponse> memberOf,
        AwakeningResponse awakening,
        Integer awakeningDegree,
        CharacterPlayerResponse player,
        BlessingResponse blessing,
        TraitResponse trait,
        //Set<OnMissiveResponse> missivesSend,
        //Set<OnMissiveResponse> missivesReceive,
        Set<CharacterOrderResponse> characterOrders,
        //Set<CharacterSkillResponse> skills,
        CharacterRaceResponse race
) {
}