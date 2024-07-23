package it.cynerea.project.be.model.dto.request.chat;

import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public record ChatRequest (
    String name,
    String description,
    String miniImg,
    String backgroundImg
){}