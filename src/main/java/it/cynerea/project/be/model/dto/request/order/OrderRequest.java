package it.cynerea.project.be.model.dto.request.order;

public record OrderRequest(
        String name,
        String description,
        String img
) {
}