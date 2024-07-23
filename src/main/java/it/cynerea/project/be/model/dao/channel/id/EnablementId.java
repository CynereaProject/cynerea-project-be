package it.cynerea.project.be.model.dao.channel.id;

import it.cynerea.project.be.model.dao.channel.Channel;
import it.cynerea.project.be.model.dao.player.Group;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EnablementId {

    @ManyToOne(optional = false)
    private Channel channel;

    @ManyToOne(optional = false)
    private Group group;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnablementId that)) return false;
        return Objects.equals(getChannel().getName(), that.getChannel().getName()) && Objects.equals(getGroup().getName(), that.getGroup().getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChannel().getName(), getGroup().getName());
    }
}