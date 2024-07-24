package it.cynerea.project.be.model.dto.response.channel;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public record EnablementResponse (
    String groupName,
    Boolean canView,
    Boolean canWrite
){}