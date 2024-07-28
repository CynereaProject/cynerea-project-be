package it.cynerea.project.be.model.dto.request.player;

public record TrophyRequest(
        //String name, PATH VARIABLE
        String description,
        String img
) {
}