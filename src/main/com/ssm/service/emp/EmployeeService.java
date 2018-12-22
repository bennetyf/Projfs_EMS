package com.ssm.service.emp;

import com.ssm.pojo.custompojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();
    void deleteById(Integer id);
    Employee findById(Integer id);
    void insertOneEmployee(Employee emp);
    void updateOneEmployeeById(Integer id, Employee emp);
}
