package it.cynerea.project.be.model.dto.response.chat;

import it.cynerea.project.be.model.dto.response.chat.id.InfluenceIdResponse;


public record InfluenceResponse(
        InfluenceIdResponse id,
        Integer worth
) {
}