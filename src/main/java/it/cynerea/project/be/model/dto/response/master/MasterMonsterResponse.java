package it.cynerea.project.be.model.dto.response.master;

import it.cynerea.project.be.model.dto.response.common.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.common.StatsResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.util.UUID;

public record MasterMonsterResponse(
        String id,
        MonsterResponse monster,
        PlayerResponse master,
        String customName,
        StatsResponse currentStats,
        ResistancesResponse currentResistances,
        MasterQuestResponse quest
) {
}