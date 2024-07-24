package it.cynerea.project.be.model.dto.response.master;

import it.cynerea.project.be.model.dto.response.thing.ThingResponse;

public record DropResponse (
    ThingResponse thing,
    Integer quantity
){}