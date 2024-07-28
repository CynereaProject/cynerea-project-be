package it.cynerea.project.be.model.dto.response.system.id;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

public record PlayerIpIdResponse(
        PlayerResponse player,
        String ip
) {
}