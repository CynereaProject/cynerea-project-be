package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dto.response.character.CharacterPartyResponse;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record MemberResponse (
    PartyPlayerResponse id,
    String role,
    String img,
    Boolean isBoss
){}