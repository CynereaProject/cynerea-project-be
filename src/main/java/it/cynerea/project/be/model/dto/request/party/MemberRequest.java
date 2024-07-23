package it.cynerea.project.be.model.dto.request.party;

import it.cynerea.project.be.model.dao.party.id.MemberId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

public record MemberRequest (
    UUID characterId,
    String role,
    String img,
    Boolean isBoss
){}