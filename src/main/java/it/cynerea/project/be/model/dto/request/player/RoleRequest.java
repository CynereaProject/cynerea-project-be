package it.cynerea.project.be.model.dto.request.player;

public record RoleRequest(
        //String name, PATH VARIABLE
        String description,
        String img,
        Boolean isAdmin,
        String groupName //CUSTOM MAPPER STRING_TO_GROUP
) {
}