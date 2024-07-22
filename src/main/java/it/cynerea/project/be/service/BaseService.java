package it.cynerea.project.be.service;

import java.util.Set;

/* ADD TO SERVICE THAN IMPLEMENT THIS INTERFACE:
@Service
* */
public interface BaseService<REQ, RES, I> {

    void create(REQ request);

    RES readById(I id);

    Set<RES> readAll();

    void update(I id, REQ request);

    void delete(I id);

}
