package it.cynerea.project.be.model.dao.relation;

import it.cynerea.project.be.model.dao.Character;
import it.cynerea.project.be.model.dao.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.net.URL;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "character_item")
public class CharacterItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne(optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @Column(name = "custom_name")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String customName;

    @Lob
    @Column(name = "custom_description")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String customDescription;

    @Column(name = "custom_img")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String customImg;

    @Lob
    @Column(name = "master_notes")
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String masterNotes;

    @Column(name = "amount")
    @JdbcTypeCode(SqlTypes.TINYINT)
    private Integer amount;

}