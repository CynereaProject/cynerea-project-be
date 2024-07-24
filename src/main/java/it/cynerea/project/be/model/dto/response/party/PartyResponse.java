package it.cynerea.project.be.model.dto.response.party;

import it.cynerea.project.be.model.dto.response.chat.InfluenceResponse;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record PartyResponse (
    String name,
    String description,
    String img,
    Boolean isGuild,
    Long coin,
    Set<InfluenceResponse> influences
    //Set<CommunicationResponse> communications = new LinkedHashSet<>(),
    //Set<MemberResponse> members = new LinkedHashSet<>(),
    //Set<BoardRecord> boards,
){}