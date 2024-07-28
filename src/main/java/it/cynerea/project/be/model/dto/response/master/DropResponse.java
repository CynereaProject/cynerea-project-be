package it.cynerea.project.be.model.dto.response.master;

import it.cynerea.project.be.model.dto.response.master.id.DropIdResponse;


public record DropResponse(
        DropIdResponse id,
        Integer quantity
) {
}