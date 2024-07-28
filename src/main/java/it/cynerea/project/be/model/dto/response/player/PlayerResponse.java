package it.cynerea.project.be.model.dto.response.player;

import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import it.cynerea.project.be.model.dto.response.chat.ChatResponse;
import it.cynerea.project.be.model.dto.response.master.DropResponse;
import it.cynerea.project.be.model.dto.response.master.MasterMonsterResponse;
import it.cynerea.project.be.model.dto.response.missive.OffGroupMissiveResponse;
import it.cynerea.project.be.model.dto.response.missive.OffMissiveResponse;
import it.cynerea.project.be.model.dto.response.quest.QuestResponse;
import it.cynerea.project.be.model.dto.response.system.CharacterLogResponse;
import it.cynerea.project.be.model.dto.response.system.ManagementLogResponse;
import it.cynerea.project.be.model.dto.response.system.PlayerIpResponse;
import it.cynerea.project.be.model.dto.response.system.PlayerLogResponse;
import it.cynerea.project.be.model.enums.Gender;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;


public record PlayerResponse(
        String id,
        String username,
        String name,
        Gender gender,
        String email,
        String password,
        Date registrationDate,
        Timestamp lastLoginDate,
        Boolean isBan,
        Date banEndDate,
        Boolean isTraining,
        Boolean isSilenced,
        Set<RoleResponse> roles,
        Set<TrophyResponse> trophies,
        Set<PlayerIpResponse> ips,
        Set<PlayerLogResponse> playerLogs,
        Set<CharacterLogResponse> characterLogs,
        Set<MasterMonsterResponse> monsters,
        Set<DropResponse> drops,
        Set<QuestResponse> quests,
        ChatResponse chat,
        Set<CharacterResponse> characters,
        Set<OffGroupMissiveResponse> groupMissivesSend,
        Set<OffMissiveResponse> missivesSend,
        Set<OffMissiveResponse> missivesReceive,
        CharacterResponse characterInUse,
        Set<ManagementLogResponse> managementLogs
) {
}