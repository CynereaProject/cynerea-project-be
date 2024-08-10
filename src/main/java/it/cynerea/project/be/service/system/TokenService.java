package it.cynerea.project.be.service.system;

import it.cynerea.project.be.exception.NotAuthException;
import it.cynerea.project.be.mapper.system.TokenMapper;
import it.cynerea.project.be.model.dao.player.Player;
import it.cynerea.project.be.model.dao.system.Token;
import it.cynerea.project.be.repository.system.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class TokenService {

    @Autowired
    private TokenMapper tokenMapper;
    @Autowired
    private TokenRepository tokenRepository;

    public String create(String playerId) {
        Token token = tokenMapper.requestToDao(playerId);
        return tokenRepository.save(token).getToken();
    }

    public Player validateToken(String id, String ...roles) {
        Optional<Token> token;
        if(Objects.isNull(roles) || roles.length == 0){
            token = tokenRepository.findById(id);
        } else {
            token = tokenRepository.findByTokenAndPlayer_Roles_Group_NameIn(id, roles);
        }

        if(token.isPresent())
            return token.get().getPlayer();
        throw new NotAuthException(id);
    }

    public void delete(String token) {
        tokenRepository.deleteById(token);
    }

    public void deleteAllByPlayerId(String id) {
        tokenRepository.deleteByPlayer_Id(id);
    }
}
