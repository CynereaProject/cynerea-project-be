package it.cynerea.project.be.model.dto.response.character;

import jakarta.persistence.Column;

public record CharacterPartyResponse (
    String partyName,
    String role,
    String img
) {}
