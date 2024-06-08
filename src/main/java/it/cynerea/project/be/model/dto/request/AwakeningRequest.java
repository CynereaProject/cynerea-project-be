package it.cynerea.project.be.model.dto.request;



import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;

import java.util.Set;

public record AwakeningRequest(@NotNull String name, @NotNull String description, @URL String img) {
}
