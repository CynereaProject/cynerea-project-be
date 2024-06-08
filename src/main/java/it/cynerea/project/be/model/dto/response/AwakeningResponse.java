package it.cynerea.project.be.model.dto.response;



import java.net.URL;
import java.util.Set;

public record AwakeningResponse(Integer id, String name, String description, String img, Set<SkillResponse> skills) {
}
