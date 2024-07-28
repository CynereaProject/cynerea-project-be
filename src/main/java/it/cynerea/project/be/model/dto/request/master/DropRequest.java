package it.cynerea.project.be.model.dto.request.master;

public record DropRequest(
        //PlayerRequest master, OBTAIN BY TOKEN
        Long thingId, //CUSTOM MAPPER LONG_TO_THING
        Integer quantity
) {
}