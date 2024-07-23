package it.cynerea.project.be.model.dto.request.player;

public record RoleRequest(
        String description,
        String img,
        Boolean isAdmin,
        String groupName
) {
}