package it.cynerea.project.be.model.dto.request.missive;

import it.cynerea.project.be.model.dao.player.Group;
import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public record OffGroupMissiveRequest (
    UUID senderId,
    String groupName,
    String title,
    String text
){}