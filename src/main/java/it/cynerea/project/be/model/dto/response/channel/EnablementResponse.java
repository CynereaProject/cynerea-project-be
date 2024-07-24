package it.cynerea.project.be.model.dto.response.channel;

public record EnablementResponse(
        String groupName,
        Boolean canView,
        Boolean canWrite
) {
}