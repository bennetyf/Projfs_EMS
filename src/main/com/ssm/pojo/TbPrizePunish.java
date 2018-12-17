package com.ssm.pojo;

import java.util.Date;

public class TbPrizePunish {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_prize_punish.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_prize_punish.pp_title
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String ppTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_prize_punish.pp_type
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String ppType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_prize_punish.pp_money
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Double ppMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_prize_punish.pp_time
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private Date ppTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_prize_punish.pp_content
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    private String ppContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_prize_punish.id
     *
     * @return the value of tb_prize_punish.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_prize_punish.id
     *
     * @param id the value for tb_prize_punish.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_prize_punish.pp_title
     *
     * @return the value of tb_prize_punish.pp_title
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getPpTitle() {
        return ppTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_prize_punish.pp_title
     *
     * @param ppTitle the value for tb_prize_punish.pp_title
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setPpTitle(String ppTitle) {
        this.ppTitle = ppTitle == null ? null : ppTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_prize_punish.pp_type
     *
     * @return the value of tb_prize_punish.pp_type
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getPpType() {
        return ppType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_prize_punish.pp_type
     *
     * @param ppType the value for tb_prize_punish.pp_type
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setPpType(String ppType) {
        this.ppType = ppType == null ? null : ppType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_prize_punish.pp_money
     *
     * @return the value of tb_prize_punish.pp_money
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Double getPpMoney() {
        return ppMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_prize_punish.pp_money
     *
     * @param ppMoney the value for tb_prize_punish.pp_money
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setPpMoney(Double ppMoney) {
        this.ppMoney = ppMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_prize_punish.pp_time
     *
     * @return the value of tb_prize_punish.pp_time
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Date getPpTime() {
        return ppTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_prize_punish.pp_time
     *
     * @param ppTime the value for tb_prize_punish.pp_time
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setPpTime(Date ppTime) {
        this.ppTime = ppTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_prize_punish.pp_content
     *
     * @return the value of tb_prize_punish.pp_content
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getPpContent() {
        return ppContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_prize_punish.pp_content
     *
     * @param ppContent the value for tb_prize_punish.pp_content
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setPpContent(String ppContent) {
        this.ppContent = ppContent == null ? null : ppContent.trim();
    }
}