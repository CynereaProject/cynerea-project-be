package it.cynerea.project.be.model.dto.response.channel;

import it.cynerea.project.be.model.dto.response.channel.id.EnablementIdResponse;


public record EnablementResponse(
        EnablementIdResponse id,
        Boolean canView,
        Boolean canWrite
) {
}