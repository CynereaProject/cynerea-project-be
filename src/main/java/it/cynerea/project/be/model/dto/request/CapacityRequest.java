package it.cynerea.project.be.model.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CapacityRequest(@NotNull String name, @NotNull String description, @NotNull @Min(1) @Max(5) Integer maxLevel) {
}
