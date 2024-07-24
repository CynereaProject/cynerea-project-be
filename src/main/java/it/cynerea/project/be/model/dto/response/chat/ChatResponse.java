package it.cynerea.project.be.model.dto.response.chat;


import java.util.Set;

public record ChatResponse(
        Long id,
        String name,
        String description,
        String miniImg,
        String backgroundImg,
        //Set<ActionResponse> actions,
        //Set<PlayerResponse> presence,
        Set<InfluenceResponse> influences
) {
}