package it.cynerea.project.be.model.dto.response.master;

import java.util.Set;

public record RankResponse(
        String name,
        String description,
        Set<MonsterResponse> monsters
) {
}