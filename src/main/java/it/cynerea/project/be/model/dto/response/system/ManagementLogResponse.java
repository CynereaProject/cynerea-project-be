package it.cynerea.project.be.model.dto.response.system;

import it.cynerea.project.be.model.dto.response.system.id.ManagementLogIdResponse;
import it.cynerea.project.be.model.enums.ManagementLogType;


public record ManagementLogResponse(
        ManagementLogIdResponse id,
        ManagementLogType type
) {
}