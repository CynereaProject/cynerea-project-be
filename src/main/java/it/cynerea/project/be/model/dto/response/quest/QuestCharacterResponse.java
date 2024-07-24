package it.cynerea.project.be.model.dto.response.quest;

import java.util.UUID;

public record QuestCharacterResponse(
        UUID id,
        String name
) {
}
