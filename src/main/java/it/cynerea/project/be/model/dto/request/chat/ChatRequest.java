package it.cynerea.project.be.model.dto.request.chat;

public record ChatRequest(
        String name,
        String description,
        String miniImg,
        String backgroundImg
) {
}