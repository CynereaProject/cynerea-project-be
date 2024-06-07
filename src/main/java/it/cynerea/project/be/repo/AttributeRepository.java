package it.cynerea.project.be.repo;


import it.cynerea.project.be.model.dao.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Integer> {
}
