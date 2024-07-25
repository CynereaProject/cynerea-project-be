package it.cynerea.project.be.model.dto.response.player;

import it.cynerea.project.be.model.enums.Gender;

import java.sql.Date; 
import java.util.Set;
import java.util.UUID;

public record PlayerResponse(
        String id,
        String username,
        String name,
        Gender gender,
        String email,
        //String password,
        Date registrationDate,
        Date lastLoginDate,
        Boolean isBan,
        Date banEndDate,
        Boolean isTraining,
        Boolean isSilenced,
        Set<RoleResponse> roles,
        Set<TrophyResponse> trophies,
        //Set<PlayerLog> playerLogs,
        //Set<CharacterLog> characterLogs,
        //Set<MasterMonsterResponse> monsters,
        //Set<Drop> drops,
        //Set<Quest> quests
        Set<PlayerCharacterResponse> characters
        //Set<OffGroupMissiveResponse> groupMissivesSend,
        //Set<OffMissiveResponse> missivesSend,
        //Set<OffMissiveResponse> missivesReceive
) {
}