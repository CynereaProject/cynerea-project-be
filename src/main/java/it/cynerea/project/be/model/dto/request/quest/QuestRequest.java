package it.cynerea.project.be.model.dto.request.quest;

import java.util.Set;
import java.util.UUID;

public record QuestRequest(
        String name,
        UUID masterId,
        Boolean isLock,
        Set<UUID> participantsId
) {
}