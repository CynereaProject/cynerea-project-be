package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Missive;
import it.cynerea.project.be.model.dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
