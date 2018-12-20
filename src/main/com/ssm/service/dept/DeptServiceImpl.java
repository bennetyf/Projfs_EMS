package com.ssm.service.dept;

import com.ssm.dao.customdao.DepartmentMapper;
import com.ssm.pojo.TbDepartment;
import com.ssm.pojo.custompojo.Department;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class DeptServiceImpl implements DeptService{

    private DepartmentMapper departmentMapper;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public DeptServiceImpl() {
    }

    public DepartmentMapper getDepartmentMapper() {
        return departmentMapper;
    }

    @Inject
    public void setDepartmentMapper(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public List<Department> findAllDepts() {
        List<Department> list = departmentMapper.queryAllDepartment();
        for(Department dept:list){
            dept.setCreatetime(dateFormat.format(dept.getDtCreatetime()));
        }
        return list;
    }

    @Override
    public Department findById(Integer id) throws InvocationTargetException, IllegalAccessException {
        TbDepartment Tbdept = departmentMapper.selectByPrimaryKey(id);
        Department dept = new Department();
        BeanUtils.copyProperties(dept,Tbdept);
        dept.setCreatetime(dateFormat.format(dept.getDtCreatetime()));
        return dept;
    }

    @Override
    public void deleteById(Integer id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateById(Integer id,Department deptVo) {
        departmentMapper.updateByPrimaryKeySelective(deptVo);
    }

    @Override
    public void insertOneDept(Department deptVo) {
        departmentMapper.insertSelective(deptVo);
    }
}
