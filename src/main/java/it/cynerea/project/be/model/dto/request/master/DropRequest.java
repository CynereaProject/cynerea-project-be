package it.cynerea.project.be.model.dto.request.master;

import it.cynerea.project.be.model.dto.request.master.id.DropIdRequest;


public record DropRequest(
        DropIdRequest id,
        Integer quantity
) {
}