package projectpackages.janus.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by aalle on 17.05.2017.
 */
@Entity
@Table(name = "vaccination")
public class Vaccination {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "dateOfVaccine", nullable = false)
    @Temporal(value=TemporalType.DATE)
    private Date dateOfVaccine;

    @Column(name = "typeOfVaccine", nullable = false)
    private String typeOfVaccine;

    @Column(name = "seriesOfVaccine", nullable = false)
    private String seriesOfVaccine;

    @Column(name = "validUntil", nullable = false)
    private Date validUntil;

    @ManyToOne
    @JoinColumn(name = "id_passport")
    private Passport passport;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfVaccine() {
        return dateOfVaccine;
    }

    public void setDateOfVaccine(Date dateOfVaccine) {
        this.dateOfVaccine = dateOfVaccine;
    }

    public String getTypeOfVaccine() {
        return typeOfVaccine;
    }

    public void setTypeOfVaccine(String typeOfVaccine) {
        this.typeOfVaccine = typeOfVaccine;
    }

    public String getSeriesOfVaccine() {
        return seriesOfVaccine;
    }

    public void setSeriesOfVaccine(String seriesOfVaccine) {
        this.seriesOfVaccine = seriesOfVaccine;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

}
