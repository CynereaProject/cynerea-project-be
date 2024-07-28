package it.cynerea.project.be.model.dto.request.channel.id;

public record EnablementIdRequest(
        String channelName,//CUSTOM MAPPER STRING_TO_CHANNEL
        String groupName//CUSTOM MAPPER STRING_TO_GROUP
) {
}