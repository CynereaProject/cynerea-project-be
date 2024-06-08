package it.cynerea.project.be.model.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;

public record ChatRequest(
        @NotNull String name,
        @NotNull String description,
        @URL String img,
        @NotNull @Min(-10) @Max(10) Integer groupInfluence1,
        @NotNull @Min(-10) @Max(10) Integer groupInfluence2,
        @NotNull @Min(-10) @Max(10) Integer groupInfluence3,
        String masterNotes) {
}
