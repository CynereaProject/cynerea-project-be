package it.cynerea.project.be.model.dto.response;

import java.util.Set;

public record ChapterResponse(Integer id, String title, String description, Set<ParagraphResponse> paragraphs) {
}
