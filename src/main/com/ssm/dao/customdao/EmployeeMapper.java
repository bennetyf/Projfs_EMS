package com.ssm.dao.customdao;

import com.ssm.dao.TbEmployeeMapper;
import com.ssm.pojo.custompojo.Employee;

import java.util.List;

public interface EmployeeMapper extends TbEmployeeMapper {
    List<Employee> queryAllEmployee();
}
