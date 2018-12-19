package com.ssm.service.auth;

import com.ssm.dao.customdao.ManagerMapper;
import com.ssm.pojo.custompojo.Manager;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class LoginCheckImpl implements LoginCheck{
    private ManagerMapper managerMapper;

    public ManagerMapper getManagerMapper() {
        return managerMapper;
    }

    @Inject
    public void setManagerMapper(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

    @Override
    public Manager findManagerByName(String username) {
        List<Manager> list = managerMapper.queryAllByName(username);

        if(list.size()==0){
            return null;
        }else{
            return list.get(0);
        }
    }
}
