package it.cynerea.project.be.model.dao.party;

import it.cynerea.project.be.model.dao.party.id.MemberId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "pt_member")
public class Member {
    @EmbeddedId
    private MemberId id;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "img", nullable = false)
    private String img;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return Objects.equals(getId(), member.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}