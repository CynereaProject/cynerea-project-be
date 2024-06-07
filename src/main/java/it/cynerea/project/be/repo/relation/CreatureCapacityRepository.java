package it.cynerea.project.be.repo.relation;

import it.cynerea.project.be.model.dao.id.CreatureCapacityId;
import it.cynerea.project.be.model.dao.relation.CreatureCapacity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatureCapacityRepository extends JpaRepository<CreatureCapacity, CreatureCapacityId> {
}