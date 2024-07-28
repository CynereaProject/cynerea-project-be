package it.cynerea.project.be.model.dto.request.channel;

public record EnablementRequest(
        String channelName,//CUSTOM MAPPER STRING_TO_CHANNEL
        String groupName,//CUSTOM MAPPER STRING_TO_GROUP
        Boolean canView,
        Boolean canWrite
) {
}