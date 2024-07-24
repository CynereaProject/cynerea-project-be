package it.cynerea.project.be.model.dto.response.player;

public record RoleResponse(
        String name,
        String description,
        String img,
        Boolean isAdmin
) {
}