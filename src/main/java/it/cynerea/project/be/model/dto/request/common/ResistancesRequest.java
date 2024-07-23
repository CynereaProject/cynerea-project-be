package it.cynerea.project.be.model.dto.request.common;

import it.cynerea.project.be.model.enums.Affinity;


public record ResistancesRequest(
        Affinity physics,
        Affinity air,
        Affinity water,
        Affinity earth,
        Affinity fire,
        Affinity bolt,
        Affinity light,
        Affinity dark,
        Affinity poison
) {
}