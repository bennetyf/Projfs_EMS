package com.ssm.dao.customdao;

import com.ssm.dao.TbDepartmentMapper;
import com.ssm.pojo.custompojo.Department;

import java.util.List;

public interface DepartmentMapper extends TbDepartmentMapper {
    List<Department> queryAllDepartment();
}
