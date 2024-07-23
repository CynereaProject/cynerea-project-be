package it.cynerea.project.be.model.dto.request.player;

import it.cynerea.project.be.model.dao.channel.Enablement;
import it.cynerea.project.be.model.dao.missive.OffGroupMissive;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record GroupRequest (
    String description,
    String img,
    Boolean isHide
){}