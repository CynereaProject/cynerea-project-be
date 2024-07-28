package it.cynerea.project.be.model.dto.response.master.id;

import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import it.cynerea.project.be.model.dto.response.thing.ThingResponse;

public record DropIdResponse(
        PlayerResponse master,
        ThingResponse thing
) {
}