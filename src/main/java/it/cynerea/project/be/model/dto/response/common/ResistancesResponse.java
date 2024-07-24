package it.cynerea.project.be.model.dto.response.common;

import it.cynerea.project.be.model.enums.Affinity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;


public record ResistancesResponse (
    Affinity physics,
    Affinity air,
    Affinity water,
    Affinity earth,
    Affinity fire,
    Affinity bolt,
    Affinity light,
    Affinity dark,
    Affinity poison
){}