package it.cynerea.project.be.model.dto.request.order;

public record OrderSkillRequest(
        Long skillId,
        Integer unlockLevel
) {
}