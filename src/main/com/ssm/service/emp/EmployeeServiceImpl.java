package com.ssm.service.emp;

import com.ssm.dao.customdao.EmployeeMapper;
import com.ssm.pojo.TbEmployee;
import com.ssm.pojo.custompojo.Employee;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeMapper employeeMapper;
    private SimpleDateFormat dateFormat;

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    @Inject
    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public EmployeeMapper getEmployeeMapper() {
        return employeeMapper;
    }

    @Inject
    public void setEmployeeMapper(@Named("employeeMapper") EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> emplist = employeeMapper.queryAllEmployee();
        for(Employee emp: emplist){
            emp.setStartTime(dateFormat.format(emp.getEmStarttime()));
            emp.setCreateTime(dateFormat.format(emp.getEmCreatetime()));
        }
        return emplist;
    }

    @Override
    public void deleteById(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Employee findById(Integer id) {
        TbEmployee emp = employeeMapper.selectByPrimaryKey(id);
        Employee result = new Employee();
        try {
            BeanUtils.copyProperties(result,emp);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        result.setStartTime(dateFormat.format(result.getEmStarttime()));
        result.setCreateTime(dateFormat.format(result.getEmCreatetime()));
        return result;
    }

    @Override
    public void insertOneEmployee(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

    @Override
    public void updateOneEmployeeById(Integer id,Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }
}
