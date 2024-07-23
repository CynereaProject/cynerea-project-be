package it.cynerea.project.be.model.dto.request.channel;

import it.cynerea.project.be.model.dao.channel.id.EnablementId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record EnablementRequest (
    String groupName,
    Boolean canView,
    Boolean canWrite
){}