package it.cynerea.project.be.repository.order;

import it.cynerea.project.be.model.dao.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}