package it.cynerea.project.be.repo.relation;

import it.cynerea.project.be.model.dao.id.MasterCreatureId;
import it.cynerea.project.be.model.dao.relation.MasterCreature;
import it.cynerea.project.be.model.enums.Affinity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterCreatureRepository extends JpaRepository<MasterCreature, MasterCreatureId> {
}