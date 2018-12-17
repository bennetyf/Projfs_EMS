package com.ssm.pojo;

import java.util.Date;

public class TbEmployee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_serialNumber
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emSerialnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_firstName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emFirstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_lastName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emLastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_sex
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_age
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Integer emAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_IDCard
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emIdcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_born
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emBorn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_nation
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emNation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_marriage
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emMarriage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_visage
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emVisage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_ancestralHome
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emAncestralhome;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_tel
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_address
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_afterSchool
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emAfterschool;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_speciality
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emSpeciality;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_culture
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emCulture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_startTime
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Date emStarttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_departmentId
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Integer emDepartmentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_typeWork
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emTypework;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_creatTime
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Date emCreattime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_createName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emCreatename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_employee.em_bz
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String emBz;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.id
     *
     * @return the value of tb_employee.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.id
     *
     * @param id the value for tb_employee.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_serialNumber
     *
     * @return the value of tb_employee.em_serialNumber
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmSerialnumber() {
        return emSerialnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_serialNumber
     *
     * @param emSerialnumber the value for tb_employee.em_serialNumber
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmSerialnumber(String emSerialnumber) {
        this.emSerialnumber = emSerialnumber == null ? null : emSerialnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_firstName
     *
     * @return the value of tb_employee.em_firstName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmFirstname() {
        return emFirstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_firstName
     *
     * @param emFirstname the value for tb_employee.em_firstName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmFirstname(String emFirstname) {
        this.emFirstname = emFirstname == null ? null : emFirstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_lastName
     *
     * @return the value of tb_employee.em_lastName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmLastname() {
        return emLastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_lastName
     *
     * @param emLastname the value for tb_employee.em_lastName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmLastname(String emLastname) {
        this.emLastname = emLastname == null ? null : emLastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_sex
     *
     * @return the value of tb_employee.em_sex
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmSex() {
        return emSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_sex
     *
     * @param emSex the value for tb_employee.em_sex
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmSex(String emSex) {
        this.emSex = emSex == null ? null : emSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_age
     *
     * @return the value of tb_employee.em_age
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Integer getEmAge() {
        return emAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_age
     *
     * @param emAge the value for tb_employee.em_age
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmAge(Integer emAge) {
        this.emAge = emAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_IDCard
     *
     * @return the value of tb_employee.em_IDCard
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmIdcard() {
        return emIdcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_IDCard
     *
     * @param emIdcard the value for tb_employee.em_IDCard
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmIdcard(String emIdcard) {
        this.emIdcard = emIdcard == null ? null : emIdcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_born
     *
     * @return the value of tb_employee.em_born
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmBorn() {
        return emBorn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_born
     *
     * @param emBorn the value for tb_employee.em_born
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmBorn(String emBorn) {
        this.emBorn = emBorn == null ? null : emBorn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_nation
     *
     * @return the value of tb_employee.em_nation
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmNation() {
        return emNation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_nation
     *
     * @param emNation the value for tb_employee.em_nation
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmNation(String emNation) {
        this.emNation = emNation == null ? null : emNation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_marriage
     *
     * @return the value of tb_employee.em_marriage
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmMarriage() {
        return emMarriage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_marriage
     *
     * @param emMarriage the value for tb_employee.em_marriage
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmMarriage(String emMarriage) {
        this.emMarriage = emMarriage == null ? null : emMarriage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_visage
     *
     * @return the value of tb_employee.em_visage
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmVisage() {
        return emVisage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_visage
     *
     * @param emVisage the value for tb_employee.em_visage
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmVisage(String emVisage) {
        this.emVisage = emVisage == null ? null : emVisage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_ancestralHome
     *
     * @return the value of tb_employee.em_ancestralHome
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmAncestralhome() {
        return emAncestralhome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_ancestralHome
     *
     * @param emAncestralhome the value for tb_employee.em_ancestralHome
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmAncestralhome(String emAncestralhome) {
        this.emAncestralhome = emAncestralhome == null ? null : emAncestralhome.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_tel
     *
     * @return the value of tb_employee.em_tel
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmTel() {
        return emTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_tel
     *
     * @param emTel the value for tb_employee.em_tel
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmTel(String emTel) {
        this.emTel = emTel == null ? null : emTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_address
     *
     * @return the value of tb_employee.em_address
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmAddress() {
        return emAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_address
     *
     * @param emAddress the value for tb_employee.em_address
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmAddress(String emAddress) {
        this.emAddress = emAddress == null ? null : emAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_afterSchool
     *
     * @return the value of tb_employee.em_afterSchool
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmAfterschool() {
        return emAfterschool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_afterSchool
     *
     * @param emAfterschool the value for tb_employee.em_afterSchool
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmAfterschool(String emAfterschool) {
        this.emAfterschool = emAfterschool == null ? null : emAfterschool.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_speciality
     *
     * @return the value of tb_employee.em_speciality
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmSpeciality() {
        return emSpeciality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_speciality
     *
     * @param emSpeciality the value for tb_employee.em_speciality
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmSpeciality(String emSpeciality) {
        this.emSpeciality = emSpeciality == null ? null : emSpeciality.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_culture
     *
     * @return the value of tb_employee.em_culture
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmCulture() {
        return emCulture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_culture
     *
     * @param emCulture the value for tb_employee.em_culture
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmCulture(String emCulture) {
        this.emCulture = emCulture == null ? null : emCulture.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_startTime
     *
     * @return the value of tb_employee.em_startTime
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Date getEmStarttime() {
        return emStarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_startTime
     *
     * @param emStarttime the value for tb_employee.em_startTime
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmStarttime(Date emStarttime) {
        this.emStarttime = emStarttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_departmentId
     *
     * @return the value of tb_employee.em_departmentId
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Integer getEmDepartmentid() {
        return emDepartmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_departmentId
     *
     * @param emDepartmentid the value for tb_employee.em_departmentId
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmDepartmentid(Integer emDepartmentid) {
        this.emDepartmentid = emDepartmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_typeWork
     *
     * @return the value of tb_employee.em_typeWork
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmTypework() {
        return emTypework;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_typeWork
     *
     * @param emTypework the value for tb_employee.em_typeWork
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmTypework(String emTypework) {
        this.emTypework = emTypework == null ? null : emTypework.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_creatTime
     *
     * @return the value of tb_employee.em_creatTime
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Date getEmCreattime() {
        return emCreattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_creatTime
     *
     * @param emCreattime the value for tb_employee.em_creatTime
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmCreattime(Date emCreattime) {
        this.emCreattime = emCreattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_createName
     *
     * @return the value of tb_employee.em_createName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmCreatename() {
        return emCreatename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_createName
     *
     * @param emCreatename the value for tb_employee.em_createName
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmCreatename(String emCreatename) {
        this.emCreatename = emCreatename == null ? null : emCreatename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_employee.em_bz
     *
     * @return the value of tb_employee.em_bz
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getEmBz() {
        return emBz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_employee.em_bz
     *
     * @param emBz the value for tb_employee.em_bz
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setEmBz(String emBz) {
        this.emBz = emBz == null ? null : emBz.trim();
    }
}