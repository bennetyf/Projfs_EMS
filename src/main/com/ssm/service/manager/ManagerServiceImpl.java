package com.ssm.service.manager;

import com.ssm.dao.customdao.ManagerMapper;
import com.ssm.pojo.TbManager;
import com.ssm.pojo.custompojo.Manager;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

@Component
public class ManagerServiceImpl implements ManagerService{
    public ManagerMapper getManagerMapper() {
        return managerMapper;
    }

    @Inject
    public void setManagerMapper(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

    private ManagerMapper managerMapper;

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    @Inject
    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    private DateFormat dateFormat;

    @Override
    public void deleteById(Integer id) {
        managerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Manager getById(Integer id) {
        TbManager tbManager = managerMapper.selectByPrimaryKey(id);
        Manager manager = new Manager();

        try {
            BeanUtils.copyProperties(manager,tbManager);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return manager;
    }

    @Override
    public void insertOneManager(Manager managerVo) {
        managerMapper.insertSelective(managerVo);
    }

    @Override
    public void updateOneManagerById(Integer id, Manager managerVo) {
        managerMapper.insertSelective(managerVo);
    }
}
