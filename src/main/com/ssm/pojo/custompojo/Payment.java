package com.ssm.pojo.custompojo;

import com.fasterxml.jackson.annotation.JsonView;
import com.ssm.pojo.TbPay;

public class Payment extends TbPay {
    @JsonView(Payment.Views.QueryView.class)
    private String paymonth;

    public String getPaymonth() {
        return paymonth;
    }

    public void setPaymonth(String paymonth) {
        this.paymonth = paymonth;
    }

    public static class Views{
        public interface QueryView {}
        public interface DetailsView extends QueryView {}
    }
}
