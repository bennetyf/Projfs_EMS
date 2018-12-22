package com.ssm.service.invite;

import com.ssm.pojo.custompojo.Employee;
import com.ssm.pojo.custompojo.Invitejob;

import java.util.List;

public interface InviteService {
    List<Invitejob> findAllInvited();
    void deleteById(Integer id);
    Invitejob getById(Integer id);
    void insertOneInvited(Invitejob invitejobVo);
    void updateOneInvitedById(Integer id, Invitejob invitejobVo);
    void employOneInvited(Integer invitedId, Employee employeeVo);
}
