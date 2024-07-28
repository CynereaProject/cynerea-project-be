package it.cynerea.project.be.model.dto.response.quest;

import it.cynerea.project.be.model.dto.response.action.ActionResponse;
import it.cynerea.project.be.model.dto.response.character.CharacterResponse;
import it.cynerea.project.be.model.dto.response.master.MasterMonsterResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Date;
import java.util.Set;


public record QuestResponse(
        String id,
        String name,
        PlayerResponse master,
        Set<MasterMonsterResponse> monsters,
        Date openDate,
        Date closeDate,
        Boolean isLock,
        Set<CharacterResponse> participants,
        Set<ActionResponse> actions
) {
}