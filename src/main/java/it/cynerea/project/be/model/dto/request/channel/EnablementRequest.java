package it.cynerea.project.be.model.dto.request.channel;

public record EnablementRequest(
        String groupName,
        Boolean canView,
        Boolean canWrite
) {
}