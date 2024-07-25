package it.cynerea.project.be.model.dto.response.quest;

import java.sql.Date; 
import java.util.Set;
import java.util.UUID;

public record QuestResponse(
        String id,
        String name,
        QuestPlayerResponse master,
        //Set<MasterMonsterResponse> monsters
        Date openDate,
        Date closeDate,
        Boolean isLock,
        Set<QuestCharacterResponse> participants
        //Set<Action> actions
) {
}