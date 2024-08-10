package it.cynerea.project.be.model.dto.request.channel;

public record MessageRequest(
        //String id, GENERATE
        //Timestamp sendDate, GENERATE
        Boolean isPin,
        String channelName, //CUSTOM MAPPER STRING_TO_CHANNEL
        //PlayerDto player, OBTAIN TO TOKEN
        String text
) {
}