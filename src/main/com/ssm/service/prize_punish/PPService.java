package com.ssm.service.prize_punish;

import com.ssm.pojo.custompojo.PrizePunish;

import java.util.List;

public interface PPService {
    List<PrizePunish> findAllPrizeAndPunish();
    void deleteById(Integer id);
    PrizePunish getById(Integer id);
    void insertOnePrizeAndPunish(PrizePunish ppVo);
    void updateOnePrizeAndPunishById(Integer id, PrizePunish ppVo);
}
