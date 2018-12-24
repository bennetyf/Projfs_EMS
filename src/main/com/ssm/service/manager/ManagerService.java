package com.ssm.service.manager;

import com.ssm.pojo.custompojo.Manager;

public interface ManagerService {
   void deleteById(Integer id);
   Manager getById(Integer id);
   void insertOneManager(Manager managerVo);
   void updateOneManagerById(Integer id, Manager managerVo);
}
