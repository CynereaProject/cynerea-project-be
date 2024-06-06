package it.cynerea.project.be.model.dao;

import it.cynerea.project.be.model.dao.id.LogId;
import it.cynerea.project.be.model.enums.LogType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "log")
public class Log {
    @EmbeddedId
    private LogId id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private Date date =  new Date();

    @Column(name = "cause", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String cause;

    @Enumerated(EnumType.STRING)
    @Column(name = "log_type", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private LogType logType;

}