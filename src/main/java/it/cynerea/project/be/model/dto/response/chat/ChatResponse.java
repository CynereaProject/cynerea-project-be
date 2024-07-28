package it.cynerea.project.be.model.dto.response.chat;

import it.cynerea.project.be.model.dto.response.action.ActionResponse;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.util.Set;


public record ChatResponse(
        Long id,
        String name,
        String description,
        String miniImg,
        String backgroundImg,
        String audio,
        Set<ActionResponse> actions,
        Set<PlayerResponse> presence,
        Set<InfluenceResponse> influences
) {
}