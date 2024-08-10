package it.cynerea.project.be.service.system;

import it.cynerea.project.be.mapper.system.PlayerLogMapper;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.PlayerLog;
import it.cynerea.project.be.model.enums.PlayerLogType;
import it.cynerea.project.be.repository.system.PlayerLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerLogService {

    @Autowired
    private PlayerLogMapper playerLogMapper;
    @Autowired
    private PlayerLogRepository playerLogRepository;
    
    public void create(Player user, Player target, String cause, PlayerLogType type) {
        PlayerLog playerLog = playerLogMapper.requestToDao(user, target, cause, type);
        playerLogRepository.save(playerLog);
    }
}
