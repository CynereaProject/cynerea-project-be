package it.cynerea.project.be.model.dao.master;

import it.cynerea.project.be.model.dao.master.id.DropId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ms_drop")
public class Drop {
    @EmbeddedId
    private DropId id;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}