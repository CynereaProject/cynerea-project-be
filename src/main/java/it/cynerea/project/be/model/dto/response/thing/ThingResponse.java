package it.cynerea.project.be.model.dto.response.thing;

import it.cynerea.project.be.model.enums.Manufacture;
import it.cynerea.project.be.model.enums.ThingType;


public record ThingResponse(
        Long id,
        String name,
        String description,
        String img,
        ThingType thingType,
        String effect,
        Manufacture manufacture,
        Integer value,
        Boolean isUnique,
        Boolean isCumulative,
        ThingSubtypeResponse subtype
) {
}