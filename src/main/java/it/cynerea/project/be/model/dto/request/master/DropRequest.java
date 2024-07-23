package it.cynerea.project.be.model.dto.request.master;

public record DropRequest(
        Long thingId,
        Integer quantity
) {
}