package it.cynerea.project.be.model.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;

public record CapacityRequest(String name, String description, Integer maxLevel) {
}
