<html>
<head>
    <title>Add Pet Passport</title>
</head>
<body>
<#if errorMessage??>
<div style="color:red;font-style:italic;">
${errorMessage}
</div>
</#if>

<div>
    <fieldset>
        <legend>Add Person</legend>
        <form name="passport" action="" method="POST">
            <@spring.formCheckbox "passport.id" ""/>    <br/>
            Кличка: <@spring.formInput "passport.name" "text"/>    <br/>
            AnimalType: <@spring.formInput "passport.animalType" "" "text"/>    <br/>
            Пол: <@spring.formCheckbox "passport.gender" ""/>    <br/>
            Порода: <@spring.formInput "passport.breed" "" "text"/>    <br/>
            Окрас: <@spring.formInput "passport.color" "" "text"/>    <br/>
            Специальные признаки: <@spring.formInput "passport.specialFeatures" "" "text"/>    <br/>
            Дата рождения: <@spring.formInput "passport.dateOfBirth" "" "date"/>    <br/>
            Offspring: <@spring.formInput "passport.offspring" "" "text"/>    <br/>
            <#--Владелец: <@spring.formInput "passport.owner" "" "text"/>    <br/>-->
            <#--Иммунизация/Дегельминтизация: <@spring.formInput "passport.immunizationDeworming" "" "text"/>    <br/>-->
            Кастрация/Сериализация: <@spring.formCheckbox "passport.castrationSterilization" ""/>    <br/>
            Клиника: <@spring.formInput "passport.clinic" "" "text"/>    <br/>
            Доктор: <@spring.formInput "passport.doctor" "" "text"/>    <br/>
            Чипирование/Тату: <@spring.formCheckbox "passport.microchipTattoo" ""/>    <br/>
            Номер чипа/тату: <@spring.formInput "passport.numberMicrochipTattoo" "" "text"/>    <br/>
            <#--Дата чипирования: <@spring.formInput "passport.dateOfImplantation" "" "text"/>    <br/>-->
            Фото пасспорта: <@spring.formInput "passport.passportPhoto" "" "text"/>    <br/>
            <#--Вакцинация: <@spring.formInput "passport.vaccination" "" "text"/>    <br/>-->
            <input type="submit" value="Create" />
        </form>
    </fieldset>
</div>

</body>

</html>

<#--@Column(name = "animalType", nullable = false)-->
<#--private String animalType;-->

<#--@Column(name = "name", nullable = false)-->
<#--private String name;-->

<#--//пол-->
<#--@Column(name = "gender", nullable = false)-->
<#--private boolean gender;-->

<#--//порода-->
<#--@Column(name = "breed", nullable = false)-->
<#--private String breed;-->

<#--@Column(name = "color", nullable = false)-->
<#--private String color;-->

<#--//особые приметы-->
<#--@Column(name = "specialFeatures")-->
<#--private String specialFeatures;-->

<#--@Column(name = "dateOfBirth", nullable = false)-->
<#--@Temporal(value=TemporalType.DATE)-->
<#--private Date dateOfBirth;-->

<#--//потомство-->
<#--@Column(name = "offspring")-->
<#--private String offspring;-->

<#--@OneToOne-->
<#--@JoinColumn(name = "owner_id")-->
<#--private Owner owner;-->

<#--//Иммунизация-Дегельминтизация-->
<#--@OneToMany(mappedBy = "passport", cascade = CascadeType.ALL)-->
<#--private List<ImmunizationDeworming> immunizationDeworming;-->

    <#--@Column(name = "castrationSterilization")-->
    <#--private boolean castrationSterilization;-->

    <#--@Column(name = "clinic", nullable = false)-->
    <#--private String clinic;-->

    <#--@Column(name = "doctor", nullable = false)-->
    <#--private String doctor;-->

    <#--@Column(name = "microchipTattoo", nullable = false)-->
    <#--private boolean microchipTattoo;-->

    <#--@Column(name = "numberMicrochipTattoo", nullable = false)-->
    <#--private String numberMicrochipTattoo;-->

    <#--@Column(name = "dateOfImplantation", nullable = false)-->
    <#--@Temporal(value=TemporalType.DATE)-->
    <#--private Date dateOfImplantation;-->

    <#--@Column(name = "passportPhoto", nullable = false)-->
    <#--private String passportPhoto;-->

    <#--@OneToMany(mappedBy = "passport", cascade = CascadeType.ALL, orphanRemoval = true)-->
    <#--private List<Vaccination> vaccination;-->