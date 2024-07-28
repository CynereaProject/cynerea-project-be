package it.cynerea.project.be.model.dto.request.channel;

import java.util.Set;


public record ChannelRequest(
        //String name, PATH VARIABLE
        String description,
        String img,
        Set<String> enablements//CUSTOM MAPPER STRING_TO_GROUP
        //Set<MessageDto> messages NULL
) {
}