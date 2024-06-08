package it.cynerea.project.be.model.dto.request;

import jakarta.validation.constraints.NotNull;

public record AttributeRequest(@NotNull String name, @NotNull String description) {}
