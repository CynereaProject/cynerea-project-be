package it.cynerea.project.be.model.dto.request.master.id;

public record DropIdRequest(
        //PlayerRequest master, OBTAIN BY TOKEN
        Long thingId //CUSTOM MAPPER LONG_TO_THING
) {
}