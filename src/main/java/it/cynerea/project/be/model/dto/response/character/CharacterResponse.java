package it.cynerea.project.be.model.dto.response.character;

import it.cynerea.project.be.model.dto.response.awakening.AwakeningResponse;
import it.cynerea.project.be.model.dto.response.embedded.BlessingResponse;
import it.cynerea.project.be.model.dto.response.embedded.EquipmentResponse;
import it.cynerea.project.be.model.dto.response.embedded.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.embedded.StatsResponse;
import it.cynerea.project.be.model.dto.response.missive.OnMissiveResponse;
import it.cynerea.project.be.model.dto.response.party.MemberResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import it.cynerea.project.be.model.dto.response.race.RaceResponse;
import it.cynerea.project.be.model.dto.response.system.CharacterLogResponse;
import it.cynerea.project.be.model.enums.Gender;

import java.sql.Date;
import java.util.Set;


public record CharacterResponse(
        String id,
        String name,
        String surname,
        String nickname,
        String title,
        Gender gender,
        Integer level,
        Long experience,
        Long coin,
        Integer prestige,
        String avatar,
        String description,
        String masterNote,
        String guideNote,
        String rumors,
        Date creationDate,
        Date lastActionDate,
        Boolean isFrozen,
        StatsResponse stats,
        StatsResponse currentStats,
        ResistancesResponse resistances,
        ResistancesResponse currentResistances,
        EquipmentResponse equipment,
        Set<CharacterLogResponse> log,
        Set<InventoryResponse> inventory,
        Set<MemberResponse> memberOf,
        AwakeningResponse awakening,
        Integer awakeningDegree,
        PlayerResponse player,
        BlessingResponse blessing,
        TraitResponse trait,
        Set<OnMissiveResponse> missivesSend,
        Set<OnMissiveResponse> missivesReceive,
        Set<CharacterOrderDto> characterOrders,
        Set<CharacterSkillResponse> skills,
        RaceResponse race
) {
}