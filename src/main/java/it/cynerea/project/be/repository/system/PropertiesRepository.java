package it.cynerea.project.be.repository.system;

import it.cynerea.project.be.model.dao.system.Properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertiesRepository extends JpaRepository<Properties, String> {
}