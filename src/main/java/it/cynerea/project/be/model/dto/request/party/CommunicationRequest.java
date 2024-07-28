package it.cynerea.project.be.model.dto.request.party;

public record CommunicationRequest(
        String partyName,//CUSTOM MAPPER STRING_TO_PARTY
        //PlayerRequest player, OBTAIN BY TOKEN
        //Timestamp date, GENERATE
        Boolean isPin,
        String text
) {
}