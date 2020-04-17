package com.ssm.dao.customdao;

import com.ssm.dao.TbPrizePunishMapper;
import com.ssm.pojo.custompojo.PrizePunish;

import java.util.List;

public interface PPMapper extends TbPrizePunishMapper {
    List<PrizePunish> queryAllPP();
}
