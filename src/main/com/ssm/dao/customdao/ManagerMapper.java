package com.ssm.dao.customdao;

import com.ssm.dao.TbManagerMapper;
import com.ssm.pojo.custompojo.Manager;

import java.util.List;

public interface ManagerMapper extends TbManagerMapper {
    List<Manager> queryAllByName(String name);
}
