package com.ssm.pojo.custompojo;

import com.ssm.pojo.TbInvitejob;

public class Invitejob extends TbInvitejob{
    private String CreateTime;

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public static class Views{
        public interface QueryView {}
        public interface DetailsView extends QueryView {}
    }
}
