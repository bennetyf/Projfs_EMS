package com.ssm.service.invite;

import com.ssm.dao.customdao.InvitejobMapper;
import com.ssm.pojo.TbInvitejob;
import com.ssm.pojo.custompojo.Employee;
import com.ssm.pojo.custompojo.Invitejob;
import com.ssm.service.emp.EmployeeService;
import com.ssm.service.emp.EmployeeServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class InviteServiceImpl implements InviteService{
    private SimpleDateFormat dateFormat;
    private InvitejobMapper invitejobMapper;
    private EmployeeService employeeService;

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    @Inject
    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public InvitejobMapper getInvitejobMapper() {
        return invitejobMapper;
    }

    @Inject
    public void setInvitejobMapper(@Named("invitejobMapper") InvitejobMapper invitejobMapper) {
        this.invitejobMapper = invitejobMapper;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    @Inject
    public void setEmployeeService(@Named("employeeServiceImpl") EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public List<Invitejob> findAllInvited() {
        List<Invitejob> invitejobList = invitejobMapper.queryAllInvited();
        for(Invitejob invitejob:invitejobList){
            invitejob.setCreateTime(dateFormat.format(invitejob.getCreatetime()));
        }
        return invitejobList;
    }

    @Override
    public void deleteById(Integer id) {
        invitejobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Invitejob getById(Integer id) {
        TbInvitejob tbInvitejob = invitejobMapper.selectByPrimaryKey(id);
        Invitejob invitejob = new Invitejob();

        try {
            BeanUtils.copyProperties(invitejob,tbInvitejob);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        invitejob.setCreateTime(dateFormat.format(invitejob.getCreatetime()));
        return invitejob;
    }

    @Override
    public void insertOneInvited(Invitejob invitejobVo) {
        invitejobMapper.insertSelective(invitejobVo);
    }

    @Override
    public void updateOneInvitedById(Integer id, Invitejob invitejobVo) {
        invitejobMapper.updateByPrimaryKey(invitejobVo);
    }

    @Override
    public void employOneInvited(Integer invitedId, Employee employeeVo) {
        invitejobMapper.deleteByPrimaryKey(invitedId);
        employeeService.insertOneEmployee(employeeVo);
    }
}
