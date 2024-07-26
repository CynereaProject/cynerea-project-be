package it.cynerea.project.be.service;

import it.cynerea.project.be.model.dao.player.Player;

import java.util.Set;

/* ADD TO SERVICE THAN IMPLEMENT THIS INTERFACE:
@Service
* */
public interface BaseService<REQ, RES, I> {

    void create(REQ request, Player user);

    RES readById(I id, Player user);

    Set<RES> readAll(Player user);

    void update(I id, REQ request, Player user);

    void delete(I id, Player user);

}
