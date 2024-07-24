package it.cynerea.project.be.model.dto.response.common;

import it.cynerea.project.be.model.enums.Affinity;


public record ResistancesResponse(
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