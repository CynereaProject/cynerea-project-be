package it.cynerea.project.be.model.dao.chat;

import it.cynerea.project.be.model.dao.action.Action;
import it.cynerea.project.be.model.dao.player.Player;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "cht_chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cht_chat_seq")
    @SequenceGenerator(name = "cht_chat_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Lob
    @Column(name = "description", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String description;

    @Column(name = "mini_img", nullable = false)
    private String miniImg;

    @Column(name = "background_img", nullable = false)
    private String backgroundImg;

    @ManyToMany
    @JoinTable(name = "cht_chat_actions",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "action_id"))
    private Set<Action> actions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "chat", orphanRemoval = true)
    private Set<Player> presence = new LinkedHashSet<>();

    @OneToMany(mappedBy = "id.chat", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Influence> influences = new LinkedHashSet<>();

}