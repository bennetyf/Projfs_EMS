package com.ssm.dao.customdao;

import com.ssm.pojo.custompojo.Manager;

import java.util.List;

public interface ManagerMapper {
    List<Manager> queryAllByName(String name);
}
