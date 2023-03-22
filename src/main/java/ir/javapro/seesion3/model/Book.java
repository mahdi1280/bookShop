package ir.javapro.seesion3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(schema = SchemaName.SchemaName)
public class Book extends BaseEntity {

    private String name;
    private long price;
}
