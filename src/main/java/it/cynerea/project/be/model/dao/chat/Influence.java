package it.cynerea.project.be.model.dao.chat;

import it.cynerea.project.be.model.dao.chat.id.InfluenceId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cht_influence")
public class Influence {
    @EmbeddedId
    private InfluenceId id;

    @Column(name = "worth", nullable = false)
    private Integer worth;

}