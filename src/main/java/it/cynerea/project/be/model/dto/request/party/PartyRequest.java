package it.cynerea.project.be.model.dto.request.party;

import it.cynerea.project.be.model.dao.chat.Influence;
import it.cynerea.project.be.model.dao.party.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public record PartyRequest (
    String description,
    String img,
    Boolean isGuild,
    Set<UUID> members
){}