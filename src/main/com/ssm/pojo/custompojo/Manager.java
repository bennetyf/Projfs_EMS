package com.ssm.pojo.custompojo;

import com.ssm.pojo.TbManager;

public class Manager extends TbManager {
    public static class Views{
        public interface QueryView {}
        public interface DetailsView extends QueryView {}
    }
}
