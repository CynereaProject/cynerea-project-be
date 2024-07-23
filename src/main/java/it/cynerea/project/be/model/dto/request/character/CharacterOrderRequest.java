package it.cynerea.project.be.model.dto.request.character;

import it.cynerea.project.be.model.dao.character.id.CharacterOrderId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


public record CharacterOrderRequest (
    Long orderId,
    Integer level,
    Boolean isExcellence
){}