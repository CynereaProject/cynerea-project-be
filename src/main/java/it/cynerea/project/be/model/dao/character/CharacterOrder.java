package it.cynerea.project.be.model.dao.character;

import it.cynerea.project.be.model.dao.character.id.CharacterOrderId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ch_character_order")
public class CharacterOrder {
    @EmbeddedId
    private CharacterOrderId id;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Column(name = "is_excellence", nullable = false)
    private Boolean isExcellence = false;

}