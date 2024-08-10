package it.cynerea.project.be.model.dto.request.system;

public record LoginRequest(
        String username,
        String password
) {
}
