package it.cynerea.project.be.model.dto.request.party;

import java.util.Set;
import java.util.UUID;

public record PartyRequest(
        String description,
        String img,
        Boolean isGuild,
        Set<UUID> members
) {
}