package it.cynerea.project.be.service.system;

import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.PlayerIp;
import it.cynerea.project.be.repository.system.PlayerIpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerIpService {
    @Autowired
    private PlayerIpRepository playerIpRepository;

    public void create(Player user, String ip) {
        PlayerIp playerIp = new PlayerIp(user, ip);
        playerIpRepository.save(playerIp);
    }
}
