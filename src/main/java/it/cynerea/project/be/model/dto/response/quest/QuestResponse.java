package it.cynerea.project.be.model.dto.response.quest;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record QuestResponse(
        UUID id,
        String name,
        QuestPlayerResponse master,
        //Set<MasterMonsterResponse> monsters
        Instant openDate,
        Instant closeDate,
        Boolean isLock,
        Set<QuestCharacterResponse> participants
        //Set<Action> actions
) {
}