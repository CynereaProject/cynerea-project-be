package it.cynerea.project.be.model.dto.response.channel;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;

import java.sql.Timestamp;


public record MessageResponse(
        String id,
        Timestamp sendDate,
        Boolean isPin,
        ChannelResponse channel,
        PlayerResponse player,
        String text
) {
}