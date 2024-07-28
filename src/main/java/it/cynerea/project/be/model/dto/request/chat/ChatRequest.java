package it.cynerea.project.be.model.dto.request.chat;


public record ChatRequest(
        //Long id, GENERATE
        String name,
        String description,
        String miniImg,
        String backgroundImg,
        String audio
        //Set<ActionRequest> actions, NULL
        //Set<PlayerDto> presence, NULL
        //Set<InfluenceDto> influences ALL TO 0
) {
}