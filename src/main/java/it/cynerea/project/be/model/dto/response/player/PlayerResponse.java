package it.cynerea.project.be.model.dto.response.player;

import it.cynerea.project.be.model.enums.Gender;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record PlayerResponse(
        UUID id,
        String username,
        String name,
        Gender gender,
        String email,
        //String password,
        Instant registrationDate,
        Instant lastLoginDate,
        Boolean isBan,
        Instant banEndDate,
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