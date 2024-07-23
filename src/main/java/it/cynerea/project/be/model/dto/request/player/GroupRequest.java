package it.cynerea.project.be.model.dto.request.player;

public record GroupRequest(
        String description,
        String img,
        Boolean isHide
) {
}