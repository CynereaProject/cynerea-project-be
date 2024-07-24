package it.cynerea.project.be.model.dto.response.master;

import java.util.UUID;

public record MasterQuestResponse(
   UUID id,
   String questName
) {}
