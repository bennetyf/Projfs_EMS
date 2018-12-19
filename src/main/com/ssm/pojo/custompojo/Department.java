package com.ssm.pojo.custompojo;

import com.ssm.pojo.TbDepartment;

public class Department extends TbDepartment {
    public Department() {
    }

    private int numEmployee;
    private String createtime;

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }
}
