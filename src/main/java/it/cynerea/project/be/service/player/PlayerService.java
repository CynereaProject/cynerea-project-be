package it.cynerea.project.be.service.player;

import it.cynerea.project.be.exception.NotAuthException;
import it.cynerea.project.be.exception.NotFoundException;
import it.cynerea.project.be.mapper.player.PlayerMapper;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dto.request.player.PlayerRequest;
import it.cynerea.project.be.model.dto.request.system.LoginRequest;
import it.cynerea.project.be.model.dto.response.player.PlayerResponse;
import it.cynerea.project.be.model.enums.Gender;
import it.cynerea.project.be.repository.player.PlayerRepository;
import it.cynerea.project.be.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.*;

@Service
public class PlayerService implements BaseService<PlayerRequest, PlayerResponse, String> {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PlayerMapper playerMapper;


    @Override
    public void create(PlayerRequest request, Player user) {
        Player player = playerMapper.requestToDao(request);
        playerRepository.save(player);
    }

    @Override
    public PlayerResponse readById(String id, Player user) {
        Optional<Player> optional = playerRepository.findById(id);
        return optional.map(value -> playerMapper.daoToResponse(value)).orElse(null);
    }

    @Override
    public Set<PlayerResponse> readAll(Player user) {
        List<Player> playerList = playerRepository.findAll();
        return playerMapper.daoListToResponseSet(playerList);
    }

    @Override
    public void update(String id, PlayerRequest request, Player user) {
        if (!Objects.equals(id, user.getId()))
            throw new NotAuthException("User " + user + " not auth for this action!");

        Optional<Player> optional = playerRepository.findById(id);
        if(optional.isPresent()) {
            Player player = optional.get();
            if (Objects.nonNull(request.name()))
                player.setName(request.name());
            if (Objects.nonNull(request.gender()))
                player.setGender(request.gender());
            if (Objects.nonNull(request.email()))
                player.setEmail(request.email());
            if (Objects.nonNull(request.password()))
                player.setPassword(request.password());
            playerRepository.save(player);
        } else {
            throw new NotFoundException("player", id);
        }
    }

    @Override
    public void delete(String id, Player user) {

    }

    public Player authorize(LoginRequest request) {
        Optional<Player> optional = playerRepository.findByUsernameAndPassword(request.username(), request.password());
        if (optional.isPresent()){
            Player player = optional.get();
            player.updateLastLoginDate();
            return playerRepository.save(player);
        } else {
            return null;
        }
    }

    public Player ban(String id, Integer numberOfDays, Player user) {
        if (!Objects.equals(id, user.getId()))
            throw new NotAuthException("User " + user + " not auth for this action!");

        Optional<Player> optional = playerRepository.findById(id);
        if(optional.isPresent()) {
            Player player = optional.get();
            player.setIsBan(true);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new java.util.Date());
            calendar.add(Calendar.DATE, numberOfDays);
            player.setBanEndDate(new Date(calendar.getTime().getTime()));

            return playerRepository.save(player);
        } else {
            throw new NotFoundException("player", id);
        }
    }

    public Player unban(String id, Player user) {
        if (!Objects.equals(id, user.getId()))
            throw new NotAuthException("User " + user + " not auth for this action!");

        Optional<Player> optional = playerRepository.findById(id);
        if(optional.isPresent()) {
            Player player = optional.get();
            player.setIsBan(false);
            player.setBanEndDate(null);

            return playerRepository.save(player);
        } else {
            throw new NotFoundException("player", id);
        }
    }

    public Player training(String id, Player user) {
        if (!Objects.equals(id, user.getId()))
            throw new NotAuthException("User " + user + " not auth for this action!");

        Optional<Player> optional = playerRepository.findById(id);
        if(optional.isPresent()) {
            Player player = optional.get();
            player.setIsTraining(true);
            return playerRepository.save(player);
        } else {
            throw new NotFoundException("player", id);
        }
    }

    public Player unTraining(String id, Player user) {
        if (!Objects.equals(id, user.getId()))
            throw new NotAuthException("User " + user + " not auth for this action!");

        Optional<Player> optional = playerRepository.findById(id);
        if(optional.isPresent()) {
            Player player = optional.get();
            player.setIsTraining(false);
            return playerRepository.save(player);
        } else {
            throw new NotFoundException("player", id);
        }
    }

    public Player silenced(String id, Player user) {
        if (!Objects.equals(id, user.getId()))
            throw new NotAuthException("User " + user + " not auth for this action!");

        Optional<Player> optional = playerRepository.findById(id);
        if(optional.isPresent()) {
            Player player = optional.get();
            player.setIsSilenced(true);
            return playerRepository.save(player);
        } else {
            throw new NotFoundException("player", id);
        }
    }

    public Player unSilenced(String id, Player user) {
        if (!Objects.equals(id, user.getId()))
            throw new NotAuthException("User " + user + " not auth for this action!");

        Optional<Player> optional = playerRepository.findById(id);
        if(optional.isPresent()) {
            Player player = optional.get();
            player.setIsSilenced(false);
            return playerRepository.save(player);
        } else {
            throw new NotFoundException("player", id);
        }
    }
}
