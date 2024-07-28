package it.cynerea.project.be.model.dto.request.party;

public record PartyRequest(
        //String name, PATH VARIABLE
        String description,
        String img,
        Boolean isGuild
        //Long coin, 0
        //Set<InfluenceRequest> influences, ALL 0
        //Set<CommunicationRequest> communications, NULL
        //Set<String> members, NULL
        //Set<BoardRequest> boards NULL
) {
}