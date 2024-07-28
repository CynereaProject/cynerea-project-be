package it.cynerea.project.be.model.dto.request.order;

import java.util.Set;


public record OrderRequest(
        //Long id, GENERATE
        String name,
        String description,
        String img,
        Set<OrderSkillRequest> skills//CUSTOM MAPPER REQUEST_TO_ORDERSKILL
) {
}