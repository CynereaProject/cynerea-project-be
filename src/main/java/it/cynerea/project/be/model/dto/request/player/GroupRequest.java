package it.cynerea.project.be.model.dto.request.player;

public record GroupRequest(
        //String name, PATH VARIABLE
        String description,
        String img,
        Boolean isHide
        //Set<RoleRequest> roles, NULL
        //Set<EnablementRequest> enablements, AUTOMIZE CHANNEL CREATION
        //Set<OffGroupMissiveRequest> missivesReceive NULL
) {
}