package projectpackages.janus.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "uuid2")
    @Column(name = "guid", unique = true, nullable = false)
    private String guid;

    @Column(name = "animalType", nullable = false)
    private String animalType;

    public Passport(String animalType) {
        this.animalType = animalType;
    }
}
