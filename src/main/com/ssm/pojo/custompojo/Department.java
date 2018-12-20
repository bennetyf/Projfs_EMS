package com.ssm.pojo.custompojo;

import com.fasterxml.jackson.annotation.JsonView;
import com.ssm.pojo.TbDepartment;

public class Department extends TbDepartment {
    public Department() {
    }

    @JsonView(Department.Views.QueryView.class)
    private int numEmployee;

    @JsonView(Department.Views.QueryView.class)
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

    public static class Views {
        public interface QueryView {}
        public interface DetailsView extends QueryView {}
    }
}
