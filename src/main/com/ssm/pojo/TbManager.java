package com.ssm.pojo;

import com.fasterxml.jackson.annotation.JsonView;
import com.ssm.pojo.custompojo.Manager;

public class TbManager {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_manager.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Manager.Views.QueryView.class)
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_manager.account
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Manager.Views.QueryView.class)
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_manager.password
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Manager.Views.DetailsView.class)
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_manager.managerLevel
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    @JsonView(Manager.Views.DetailsView.class)
    private String managerlevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_manager.id
     *
     * @return the value of tb_manager.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_manager.id
     *
     * @param id the value for tb_manager.id
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_manager.account
     *
     * @return the value of tb_manager.account
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_manager.account
     *
     * @param account the value for tb_manager.account
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_manager.password
     *
     * @return the value of tb_manager.password
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_manager.password
     *
     * @param password the value for tb_manager.password
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_manager.managerLevel
     *
     * @return the value of tb_manager.managerLevel
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public String getManagerlevel() {
        return managerlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_manager.managerLevel
     *
     * @param managerlevel the value for tb_manager.managerLevel
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    public void setManagerlevel(String managerlevel) {
        this.managerlevel = managerlevel == null ? null : managerlevel.trim();
    }
}