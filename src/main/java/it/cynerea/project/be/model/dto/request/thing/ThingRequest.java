package it.cynerea.project.be.model.dto.request.thing;

import it.cynerea.project.be.model.enums.Manufacture;
import it.cynerea.project.be.model.enums.ThingType;


public record ThingRequest(
        //Long id, GENERATE
        String name,
        String description,
        String img,
        ThingType thingType,
        String effect,
        Manufacture manufacture,
        Integer value,
        Boolean isUnique,
        Boolean isCumulative,
        ThingSubtypeRequest subtype
) {
}