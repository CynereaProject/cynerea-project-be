package it.cynerea.project.be.model.dto.response.player;

import java.util.Set;

public record GroupResponse(
        String name,
        String description,
        String img,
        Boolean isHide,
        Set<RoleResponse> roles
        //Set<EnablementResponse> enablements,
        //Set<OffGroupMissiveResponse> missivesReceive
) {
}