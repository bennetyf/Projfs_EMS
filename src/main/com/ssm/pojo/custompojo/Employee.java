package com.ssm.pojo.custompojo;

import com.ssm.pojo.TbEmployee;

public class Employee extends TbEmployee {
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    private String createTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    private String startTime;

    public static class Views{
        public interface QueryView {}
        public interface DetailsView extends QueryView {}
    }
}
