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
@Table(name = "missive")
public class Missive {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private Character sender;

    @ManyToOne(optional = false)
    @JoinColumn(name = "recipient_id", nullable = false)
    private Character recipient;

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private Date date =  new Date();

    @Column(name = "is_off", nullable = false)
    @JdbcTypeCode(SqlTypes.BIT)
    private Boolean isOff = false;

    @Lob
    @Column(name = "text", nullable = false)
    private String text;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "attached_id")
    private Missive attached;
}