package it.cynerea.project.be.model.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "quest")
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "master_id", nullable = false)
    private Character master;

    @OneToOne
    @JoinColumn(name = "chat_id", unique = true)
    private Chat chat;

    @Temporal(TemporalType.DATE)
    @Column(name = "opening_date", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private Date openingDate =  new Date();

    @Temporal(TemporalType.DATE)
    @Column(name = "closing_date")
    @JdbcTypeCode(SqlTypes.DATE)
    private Date closingDate;

}