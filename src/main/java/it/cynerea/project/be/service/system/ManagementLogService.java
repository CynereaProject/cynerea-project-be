package it.cynerea.project.be.service.system;

import it.cynerea.project.be.mapper.system.ManagementLogMapper;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.ManagementLog;
import it.cynerea.project.be.model.dto.request.awakening.AwakeningRequest;
import it.cynerea.project.be.model.dto.response.awakening.AwakeningResponse;
import it.cynerea.project.be.model.enums.ManagementLogType;
import it.cynerea.project.be.model.enums.PlayerLogType;
import it.cynerea.project.be.repository.system.ManagementLogRepository;
import it.cynerea.project.be.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ManagementLogService {

    @Autowired
    private ManagementLogMapper managementLogMapper;
    @Autowired
    private ManagementLogRepository managementLogRepository;

    public void create(Player user, String resource, ManagementLogType type) {
        ManagementLog managementLog = managementLogMapper.requestToDao(user,resource,type);
        managementLogRepository.save(managementLog);
    }
}
