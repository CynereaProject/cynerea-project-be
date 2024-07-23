package it.cynerea.project.be.model.dao.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Embeddable
public class Blessing {

    @Column(name = "blessing_name", nullable = false, unique = true)
    private String name;

    @Lob
    @Column(name = "blessing_effect", nullable = false)
    @JdbcTypeCode(SqlTypes.LONGNVARCHAR)
    private String effect;

    @Column(name = "blessing_img", nullable = false)
    private String img;

}