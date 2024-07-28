package it.cynerea.project.be.model.dto.response.master;

import it.cynerea.project.be.model.dto.response.embedded.ResistancesResponse;
import it.cynerea.project.be.model.dto.response.embedded.StatsResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import it.cynerea.project.be.model.dto.response.quest.QuestResponse;


public record MasterMonsterResponse(
        String id,
        MonsterResponse monster,
        PlayerResponse master,
        String customName,
        StatsResponse currentStats,
        ResistancesResponse currentResistances,
        QuestResponse quest
) {
}