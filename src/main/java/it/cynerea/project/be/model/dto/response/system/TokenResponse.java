package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;


public record TokenResponse(
        String token,
        PlayerResponse player
) {
}