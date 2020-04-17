package com.ssm.dao.customdao;

import com.ssm.dao.TbInvitejobMapper;
import com.ssm.pojo.custompojo.Invitejob;

import java.util.List;

public interface InvitejobMapper extends TbInvitejobMapper {
    List<Invitejob> queryAllInvited();
}
