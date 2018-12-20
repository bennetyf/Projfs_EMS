package com.ssm.pojo.custompojo;

import java.util.Date;

public class DepartmentQueryVo {
    public DepartmentQueryVo(){}

    private Department dept;

    private String deptName;
    private String deptResp;
    private Date deptCT;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptResp() {
        return deptResp;
    }

    public void setDeptResp(String deptResp) {
        this.deptResp = deptResp;
    }

    public Date getDeptCT() {
        return deptCT;
    }

    public void setDeptCT(Date deptCT) {
        this.deptCT = deptCT;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
