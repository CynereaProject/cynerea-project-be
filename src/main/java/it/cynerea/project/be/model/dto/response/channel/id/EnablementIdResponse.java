package it.cynerea.project.be.model.dto.response.channel.id;

import it.cynerea.project.be.model.dto.response.channel.ChannelResponse;
import it.cynerea.project.be.model.dto.response.player.GroupResponse;

public record EnablementIdResponse(
        ChannelResponse channel,
        GroupResponse group
) {
}