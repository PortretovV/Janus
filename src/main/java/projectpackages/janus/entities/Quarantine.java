package projectpackages.janus.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by aalle on 19.05.2017.
 */
@Entity
@Table(name = "quarantine")
public class Quarantine {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "laboratory", nullable = false)
    private String laboratory;

    @Column(name = "numberOfDays", nullable = false)
    private int numberOfDays;

    @OneToOne
    @JoinColumn(name = "addressOfLaboratory")
    private Address addressOfLaboratory;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "quarantine")
    List<Disease> diseases;
}
