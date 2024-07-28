package it.cynerea.project.be.model.dto.response.thing;

import java.util.Set;


public record ThingSubtypeResponse(
        String name,
        String description,
        Set<ThingResponse> things
) {
}