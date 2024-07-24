package it.cynerea.project.be.model.dto.response.chat;


import java.util.Objects;

public record InfluenceResponse (
    String groupName,
    Integer worth
){}