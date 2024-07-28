package it.cynerea.project.be.model.dto.request.channel;

import it.cynerea.project.be.model.dto.request.channel.id.EnablementIdRequest;


public record EnablementRequest(
        EnablementIdRequest id,
        Boolean canView,
        Boolean canWrite
) {
}