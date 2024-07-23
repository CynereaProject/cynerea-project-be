package it.cynerea.project.be.model.dao.system;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "sys_properties")
public class Properties {
    @Id
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "value", nullable = false)
    private String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Properties that)) return false;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}