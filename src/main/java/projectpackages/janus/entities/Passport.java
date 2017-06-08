package projectpackages.janus.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "animalType", nullable = false)
    private String animalType;

    @Column(name = "petName", nullable = false)
    private String petName;

    //пол
    @Column(name = "gender", nullable = false)
    private char gender;

    //порода
    @Column(name = "breed", nullable = false)
    private String breed;

    @Column(name = "color", nullable = false)
    private String color;

    //особые приметы
    @Column(name = "specialFeatures")
    private String specialFeatures;

    @Column(name = "dateOfBirth", nullable = false)
    @Temporal(value=TemporalType.DATE)
    private Date dateOfBirth;

    //потомство
    @Column(name = "offspring")
    private String offspring;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    //Иммунизация-Дегельминтизация
    @OneToMany(mappedBy = "passport", cascade = CascadeType.ALL)
    private List<ImmunizationDeworming> immunizationDeworming;

    @Column(name = "castrationSterilization")
    private boolean castrationSterilization;

    @Column(name = "clinic", nullable = false)
    private String clinic;

    @Column(name = "doctor", nullable = false)
    private String doctor;

    @Column(name = "microchipTattoo", nullable = false)
    private boolean microchipTattoo;

    @Column(name = "numberMicrochipTattoo", nullable = false)
    private String numberMicrochipTattoo;

    @Column(name = "dateOfImplantation", nullable = false)
    @Temporal(value=TemporalType.DATE)
    private Date dateOfImplantation;

    @Column(name = "passportPhoto", nullable = false)
    private String passportPhoto;

    @OneToMany(mappedBy = "passport", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vaccination> vaccination;

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOffspring() {
        return offspring;
    }

    public void setOffspring(String offspring) {
        this.offspring = offspring;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<ImmunizationDeworming> getImmunizationDeworming() {
        return immunizationDeworming;
    }

    public void setImmunizationDeworming(List<ImmunizationDeworming> immunizationDeworming) {
        this.immunizationDeworming = immunizationDeworming;
    }

    public boolean isCastrationSterilization() {
        return castrationSterilization;
    }

    public void setCastrationSterilization(boolean castrationSterilization) {
        this.castrationSterilization = castrationSterilization;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public boolean isMicrochipTattoo() {
        return microchipTattoo;
    }

    public void setMicrochipTattoo(boolean microchipTattoo) {
        this.microchipTattoo = microchipTattoo;
    }

    public String getNumberMicrochipTattoo() {
        return numberMicrochipTattoo;
    }

    public void setNumberMicrochipTattoo(String numberMicrochipTattoo) {
        this.numberMicrochipTattoo = numberMicrochipTattoo;
    }

    public Date getDateOfImplantation() {
        return dateOfImplantation;
    }

    public void setDateOfImplantation(Date dateOfImplantation) {
        this.dateOfImplantation = dateOfImplantation;
    }

    public String getPassportPhoto() {
        return passportPhoto;
    }

    public void setPassportPhoto(String passportPhoto) {
        this.passportPhoto = passportPhoto;
    }

    public List<Vaccination> getVaccination() {
        return vaccination;
    }

    public void setVaccination(List<Vaccination> vaccination) {
        this.vaccination = vaccination;
    }
}
