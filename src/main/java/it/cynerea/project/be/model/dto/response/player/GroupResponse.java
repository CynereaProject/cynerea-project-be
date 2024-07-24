package it.cynerea.project.be.model.dto.response.player;

import it.cynerea.project.be.model.dto.response.channel.EnablementResponse;
import it.cynerea.project.be.model.dto.response.missive.OffGroupMissiveResponse;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record GroupResponse (
    String name,
    String description,
    String img,
    Boolean isHide,
    Set<RoleResponse> roles
    //Set<EnablementResponse> enablements,
    //Set<OffGroupMissiveResponse> missivesReceive
){}