package com.ssm.pojo.custompojo;

import com.ssm.pojo.TbPrizePunish;

public class PrizePunish extends TbPrizePunish {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class Views{
        public interface QueryView {}
        public interface DetailsView extends QueryView {}
    }
}
