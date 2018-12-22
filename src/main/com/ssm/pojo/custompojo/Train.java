package com.ssm.pojo.custompojo;

import com.fasterxml.jackson.annotation.JsonView;
import com.ssm.pojo.TbTrain;

public class Train extends TbTrain {
    public String getTraintime() {
        return traintime;
    }

    public void setTraintime(String traintime) {
        this.traintime = traintime;
    }

    @JsonView(Train.Views.QueryView.class)
    private String traintime;

    public static class Views{
        public interface QueryView{}
        public interface DetailsView extends QueryView{}
    }
}
