package it.cynerea.project.be.model.dao.channel.id;

import it.cynerea.project.be.model.dao.channel.Channel;
import it.cynerea.project.be.model.dao.player.Group;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class EnablementId {

    @ManyToOne(optional = false)
    private Channel channel;

    @ManyToOne(optional = false)
    private Group group;

}