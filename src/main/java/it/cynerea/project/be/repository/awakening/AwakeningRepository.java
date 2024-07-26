package it.cynerea.project.be.repository.awakening;

import it.cynerea.project.be.model.dao.awakening.Awakening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwakeningRepository extends JpaRepository<Awakening, Long> {
}