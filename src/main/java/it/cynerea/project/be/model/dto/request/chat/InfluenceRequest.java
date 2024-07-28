package it.cynerea.project.be.model.dto.request.chat;

import it.cynerea.project.be.model.dto.request.chat.id.InfluenceIdRequest;


public record InfluenceRequest(
        InfluenceIdRequest id,
        Integer worth
) {
}