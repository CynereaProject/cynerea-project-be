package it.cynerea.project.be.repository.thing;

import it.cynerea.project.be.model.dao.thing.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, String> {
}