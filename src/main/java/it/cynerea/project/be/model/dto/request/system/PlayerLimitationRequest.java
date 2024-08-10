package it.cynerea.project.be.model.dto.request.system;

public record PlayerLimitationRequest(
        Integer numberOfDays,
        String cause
) {
}
