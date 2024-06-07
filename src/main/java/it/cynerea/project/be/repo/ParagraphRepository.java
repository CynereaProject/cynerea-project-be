package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Order;
import it.cynerea.project.be.model.dao.Paragraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParagraphRepository extends JpaRepository<Paragraph, Integer> {
}
