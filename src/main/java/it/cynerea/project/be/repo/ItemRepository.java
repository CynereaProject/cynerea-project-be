package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.IpAddress;
import it.cynerea.project.be.model.dao.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
