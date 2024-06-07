package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Role;
import it.cynerea.project.be.model.dao.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
}
