package com.ssm.pojo;

import com.fasterxml.jackson.annotation.JsonView;
import com.ssm.pojo.custompojo.Train;

import java.util.Date;

public class TbTrain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.QueryView.class)
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.tn_man
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.QueryView.class)
    private String tnMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.tn_title
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.QueryView.class)
    private String tnTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.tn_content
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.QueryView.class)
    private String tnContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.tn_time
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.DetailsView.class)
    private Date tnTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.tn_address
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.QueryView.class)
    private String tnAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.tn_join
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.QueryView.class)
    private String tnJoin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_train.tn_bz
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Train.Views.QueryView.class)
    private String tnBz;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.id
     *
     * @return the value of tb_train.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.id
     *
     * @param id the value for tb_train.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.tn_man
     *
     * @return the value of tb_train.tn_man
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getTnMan() {
        return tnMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.tn_man
     *
     * @param tnMan the value for tb_train.tn_man
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setTnMan(String tnMan) {
        this.tnMan = tnMan == null ? null : tnMan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.tn_title
     *
     * @return the value of tb_train.tn_title
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getTnTitle() {
        return tnTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.tn_title
     *
     * @param tnTitle the value for tb_train.tn_title
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setTnTitle(String tnTitle) {
        this.tnTitle = tnTitle == null ? null : tnTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.tn_content
     *
     * @return the value of tb_train.tn_content
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getTnContent() {
        return tnContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.tn_content
     *
     * @param tnContent the value for tb_train.tn_content
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setTnContent(String tnContent) {
        this.tnContent = tnContent == null ? null : tnContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.tn_time
     *
     * @return the value of tb_train.tn_time
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Date getTnTime() {
        return tnTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.tn_time
     *
     * @param tnTime the value for tb_train.tn_time
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setTnTime(Date tnTime) {
        this.tnTime = tnTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.tn_address
     *
     * @return the value of tb_train.tn_address
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getTnAddress() {
        return tnAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.tn_address
     *
     * @param tnAddress the value for tb_train.tn_address
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setTnAddress(String tnAddress) {
        this.tnAddress = tnAddress == null ? null : tnAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.tn_join
     *
     * @return the value of tb_train.tn_join
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getTnJoin() {
        return tnJoin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.tn_join
     *
     * @param tnJoin the value for tb_train.tn_join
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setTnJoin(String tnJoin) {
        this.tnJoin = tnJoin == null ? null : tnJoin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_train.tn_bz
     *
     * @return the value of tb_train.tn_bz
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getTnBz() {
        return tnBz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_train.tn_bz
     *
     * @param tnBz the value for tb_train.tn_bz
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setTnBz(String tnBz) {
        this.tnBz = tnBz == null ? null : tnBz.trim();
    }
}