package it.cynerea.project.be.model.dto.request.party;

public record DiscussionRequest(
        //String id, GENERATE
        String boardId,//CUSTOM MAPPER STRING_TO_BOARD
        //PlayerRequest player, OBTAIN BY TOKEN
        //Timestamp date, GENERATE
        String text
) {
}