package it.cynerea.project.be.model.dto.request.master;

import java.util.UUID;

public record MasterMonsterRequest(
    Long monsterId,
    String customName,
    UUID questId
){}