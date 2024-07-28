package it.cynerea.project.be.model.dto.request.player;

public record PlayerRequest(
        //String id, GENERATE
        String username,
        //String name,
        //Gender gender,
        String email,
        String password
        //Date registrationDate, GENERATE
        //Timestamp lastLoginDate, NULL
        //Boolean isBan, NULL
        //Date banEndDate, NULL
        //Boolean isTraining, NULL
        //Boolean isSilenced, NULL
        //Set<RoleRequest> roles, NULL
        //Set<TrophyRequest> trophies, NULL
        //Set<PlayerIpRequest> ips, NULL
        //Set<PlayerLogRequest> playerLogs, NULL
        //Set<CharacterLogRequest> characterLogs, NULL
        //Set<MasterMonsterRequest> monsters, NULL
        //Set<DropRequest> drops, NULL
        //Set<QuestRequest> quests, NULL
        //ChatRequest chat, NULL
        //Set<CharacterRequest> characters, NULL
        //Set<OffGroupMissiveRequest> groupMissivesSend, NULL
        //Set<OffMissiveRequest> missivesSend, NULL
        //Set<OffMissiveRequest> missivesReceive, NULL
        //CharacterRequest characterInUse, NULL
        //Set<ManagementLogRequest> managementLogs NULL
) {
}