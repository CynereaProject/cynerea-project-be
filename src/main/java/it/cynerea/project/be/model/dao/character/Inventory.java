package it.cynerea.project.be.model.dao.character;

import it.cynerea.project.be.model.dao.thing.Thing;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ch_inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "thing_id", nullable = false)
    private Thing thing;

    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @Column(name = "custom_name", nullable = false)
    private String customName;

    @Lob
    @Column(name = "custom_description")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String customDescription;

    @Lob
    @Column(name = "master_note")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String masterNote;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

}