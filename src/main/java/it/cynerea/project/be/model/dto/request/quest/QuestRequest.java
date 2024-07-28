package it.cynerea.project.be.model.dto.request.quest;

import java.util.Set;


public record QuestRequest(
        //String id, GENERATE
        String name,
        //PlayerRequest master, OBTAIN BY TOKEN
        Set<String> monsters, //CUSTOM MAPPER STRING_TO_MONSTERMASTER
        //Date openDate, GENERATE
        //Date closeDate, NULL
        Boolean isLock,
        Set<String> participants //CUSTOM MAPPER STRING_TO_CHARACTER
        //Set<ActionRequest> actions NULL
) {
}