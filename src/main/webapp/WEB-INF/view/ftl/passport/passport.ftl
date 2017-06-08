<#import "/spring.ftl" as spring/>

<#assign f=JspTaglibs["http://www.springframework.org/tags/form"]>
<#assign c=JspTaglibs["http://java.sun.com/jstl/core"]>
<#assign s=JspTaglibs["http://www.springframework.org/tags"]>

<html>
<head>
    <title>Add Pet Passport</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="/resources/css/materialize.css" media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="/resources/css/testcss.css"/>
    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

</head>
<body>
<#if errorMessage??>
<div style="color:red;font-style:italic;">
${errorMessage}
</div>
</#if>

<script type="text/javascript" rel="script" src="/resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" rel="script" src="/resources/js/materialize.min.js"></script>


<form name="passport" action="" method="POST">

    <div class="row">
        <div>
            <input type="hidden" name="id" value="${passport.id}">
        </div>
        <div class="input-field col s6">
            <input type="text" id="petName" name="petName" value="${passport.petName!""}" class="validate">
            <label for="petName">petName</label>
        </div>
        <div class="input-field col s6">
            <input type="text" id="animalType" name="animalType" value="${passport.animalType!""}" class="validate">
            <label for="animalType">animalType</label>
        </div>
    </div>

    <div class="row">
        <div class="input-field col s6">
            <input type="text" id="breed" name="breed" value="${passport.breed!""}" class="validate">
            <label for="breed">breed</label>
        </div>
        <div class="input-field col s6">
            <input type="text" id="color" name="color" value="${passport.color!""}" class="validate">
            <label for="color">color</label>
        </div>
    </div>

    <div class="row">
        <div class="input-field col s3">
            <input type="text" id="dateOfBirth" name="dateOfBirth" value="${passport.dateOfBirth?string("dd/MM/yyyy")}"
                   class="validate">
            <label for="dateOfBirth">dateOfBirth</label>
        </div>
        <div class="input-field col s3">
            <p>
            <#if passport.gender=='М'>
                <input type="radio" name="gender" id="gender1" checked/>
                <label for="gender1">М</label>
                <input type="radio" name="gender" id="gender2"/>
                <label for="gender2">Ж</label>
            <#else>
                <input type="radio" name="gender" id="gender1"/>
                <label for="gender1">М</label>
                <input type="radio" name="gender" id="gender2" checked/>
                <label for="gender2">Ж</label>
            </#if>
            </p>
        </div>
        <div class="input-field col s3">
            <input type="checkbox" id="microchipTattoo" name="microchipTattoo"
                   <#if passport.microchipTattoo == true>checked</#if> value="" class="validate">
            <label for="numberMicrochipTattoo">numberMicrochipTattoo</label>
        </div>
        <div class="input-field col s3">
            <input type="checkbox" id="castrationSterilization" name="castrationSterilization"
                   <#if passport.castrationSterilization == true>checked</#if> value="" class="validate">
            <label for="castrationSterilization">castrationSterilization</label>
        </div>
    </div>

    <div class="row">
        <div class="input-field col s6">
            <input type="text" id="numberMicrochipTattoo" name="numberMicrochipTattoo"
                   value="${passport.numberMicrochipTattoo!""}" class="validate">
            <label for="numberMicrochipTattoo">numberMicrochipTattoo</label>
        </div>
        <div class="input-field col s6">
            <input type="text" id="dateOfImplantation" name="dateOfImplantation"
                   value="${passport.dateOfImplantation?string("dd/MM/yyyy")}" class="validate">
            <label for="dateOfImplantation">dateOfImplantation</label>
        </div>
    </div>

    <div class="row">
        <div class="input-field col s6">
            <input type="text" id="clinic" name="clinic" value="${passport.clinic!""}" class="validate">
            <label for="clinic">clinic</label>
        </div>
        <div class="input-field col s6">
            <input type="text" id="doctor" name="doctor" value="${passport.doctor!""}" class="validate">
            <label for="doctor">doctor</label>
        </div>
    </div>

    <div class="row">
        <div class="input-field col s12">
            <input type="text" id="passportPhoto" name="passportPhoto" value="${passport.passportPhoto!""}"
                   class="validate">
            <label for="passportPhoto">passportPhoto</label>
        </div>
    </div>

    <div class="row">
        <div class="input-field col s12">
            <input type="text" id="offspring" name="offspring" value="${passport.offspring!""}" class="validate">
            <label for="offspring">offspring</label>
        </div>
    <div class="row">
        <div class="input-field col s12">
            <textarea id="specialFeatures" name="specialFeatures" value="${passport.specialFeatures!""}" class="validate">
            <label for="specialFeatures">specialFeatures</label>
        </div>
    </div>
    <div class="row">
        <div class="col s12">

        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <input type="submit" value="Создать"/>
        </div>
    </div>
</form>

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


<#--<input type="hidden" name="id" value="${passport.id}"/>

<option value="${passport.gender}" selected>М</option>
            <option value="М">М</option>
            <option value="Ж">Ж</option>


              <br/>-->
<#--Кличка: <input type="text" name="name" />    <br/>&lt;#&ndash; value="${passport.name}"          value="${passport.gender}"     &ndash;&gt;-->
<#--animalType <input type="text" name="animalType" value="${passport.animalType!""}"/>    <br/>-->
<#--<input type="text" name="gender" value="${passport.gender?string("yes", "no")}"/>    <br/>-->
<#--Пол: <input type="">-->
<#--Парода:<input type="text" name="breed" value="${passport.breed!""}"/>    <br/>-->
<#--Цвет:<input type="text" name="color" value="${passport.color!""}"/>    <br/>-->
<#--Особые приметы specialFeatures:<input type="text" name="specialFeatures" value="${passport.specialFeatures!""}"/>    <br/>-->
<#--Date Дата рождения:<input type="text" name="dateOfBirth" value="${passport.dateOfBirth?string("dd/MM/yyyy")}"/>    <br/>-->
<#--Потомство:<input type="text" name="offspring" value="${passport.offspring!""}"/>    <br/>-->
<#--&lt;#&ndash;<input type="text" name="owner" value="owner"/>    <br/>&ndash;&gt;-->
<#--&lt;#&ndash;<input type="text" name="immunizationDeworming" value="${passport.breed}"/>    <br/>&ndash;&gt;-->

<#--<#if passport.castrationSterilization??>-->
<#--Кастрация/стрерилизация:<input type="checkbox" name="castrationSterilization" checked="checked"/>    <br/>-->
<#--<#else>-->
<#--Кастрация/стрерилизация:<input type="checkbox" name="castrationSterilization"/>    <br/>-->
<#--</#if>-->
<#--Кастрация/стрерилизация:<input type="checkbox" name="castrationSterilization" checked="checked"/>    <br/>-->
<#--Клиника:<input type="text" name="clinic" value="${passport.clinic!""}" />    <br/>-->
<#--Доктор:<input type="text" name="doctor" value="${passport.doctor!""}"/>    <br/>-->
<#--&lt;#&ndash;Наличие микрочипа/тату:<input type="checkbox" name="microchipTattoo" value="${passport.microchipTattoo!""}"/>    <br/>&ndash;&gt;-->
<#--Номер микрочипа/тату:<input type="text" name="numberMicrochipTattoo" value="${passport.numberMicrochipTattoo!""}"/>    <br/>-->
<#--Дата <input type="text" name="dateOfImplantation" value="${passport.dateOfImplantation?string("dd/MM/yyyy")}"/>    <br/>-->
<#--Фото паспорта:<input type="text" name="passportPhoto" value="${passport.passportPhoto!""}"/>    <br/>-->
<#--&lt;#&ndash;<input type="text" name="vaccination" value="${passport.breed}"/>    <br/>&ndash;&gt;-->
<#--<input type="submit" value="Создать" />-->
