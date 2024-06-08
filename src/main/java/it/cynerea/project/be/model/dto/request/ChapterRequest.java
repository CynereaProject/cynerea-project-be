package it.cynerea.project.be.model.dto.request;

import jakarta.validation.constraints.NotNull;

public record ChapterRequest(@NotNull String title, @NotNull String description) {
}
