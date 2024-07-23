package it.cynerea.project.be.model.dto.request.common;

public record BlessingRequest(
    String name,
    String effect,
    String img
){}