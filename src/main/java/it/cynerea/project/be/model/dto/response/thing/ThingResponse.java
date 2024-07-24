package it.cynerea.project.be.model.dto.response.thing;

import it.cynerea.project.be.model.enums.Manufacture;
import it.cynerea.project.be.model.enums.ThingType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record ThingResponse (
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
    ThingSubtypeResponse subtype,
    Set<AttributeResponse> attributes
){}