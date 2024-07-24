package it.cynerea.project.be.model.dto.response.channel;

import java.util.Set;

public record ChannelResponse(
        String name,
        String description,
        String img,
        Set<EnablementResponse> enablements
        //Set<MessageResponse> messageResponses
) {
}