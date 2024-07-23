package it.cynerea.project.be.model.dto.request.player;

import it.cynerea.project.be.model.enums.Gender;

public record PlayerRequest(
        String username,
        String name,
        Gender gender,
        String email
) {
}