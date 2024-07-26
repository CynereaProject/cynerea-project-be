package it.cynerea.project.be.repository.order;

import it.cynerea.project.be.model.dao.order.OrderSkill;
import it.cynerea.project.be.model.dao.order.id.OrderSkillId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSkillRepository extends JpaRepository<OrderSkill, OrderSkillId> {
}