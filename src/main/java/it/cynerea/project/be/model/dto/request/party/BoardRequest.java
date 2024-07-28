package it.cynerea.project.be.model.dto.request.party;

public record BoardRequest(
        //String id, GENERATE
        String partyName,//CUSTOM MAPPER STRING_TO_PARTY
        //PlayerRequest player, OBTAIN BY TOKEN
        //Timestamp date, GENERATE
        String title,
        String text
        //Set<DiscussionRequest> discussion NULL
) {
}