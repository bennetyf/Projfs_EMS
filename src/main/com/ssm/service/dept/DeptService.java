package com.ssm.service.dept;

import com.ssm.pojo.custompojo.Department;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface DeptService {
    List<Department> findAllDepts();
    Department findById(Integer id);
    void deleteById(Integer id);
    void updateById(Integer id, Department deptVo);
    void insertOneDept(Department deptVo);
}
