package it.cynerea.project.be.model.dto.request.character;

import it.cynerea.project.be.model.dao.embedded.Equipment;
import it.cynerea.project.be.model.enums.Gender;

import java.util.UUID;

public record CharacterRequest(
        String name,
        String surname,
        Gender gender,
        String avatar,
        Equipment equipment,
        UUID playerId,
        Long raceId
) {
}