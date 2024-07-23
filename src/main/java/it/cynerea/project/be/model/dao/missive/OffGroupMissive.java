package it.cynerea.project.be.model.dao.missive;

import it.cynerea.project.be.model.dao.player.Group;
import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "msv_off_group_missive")
public class OffGroupMissive {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private Player sender;

    @ManyToOne(optional = false)
    @JoinColumn(name = "group_name", nullable = false)
    private Group group;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "text", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String text;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "off_group_missive_id")
    private Set<OffGroupDiscussion> offGroupDiscussions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "offGroupMissive", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OffGroupReply> offGroupReplies = new LinkedHashSet<>();

}