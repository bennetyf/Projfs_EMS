package com.ssm.service.prize_punish;

import com.ssm.dao.customdao.PPMapper;
import com.ssm.pojo.TbPrizePunish;
import com.ssm.pojo.custompojo.PrizePunish;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.List;

@Component
public class PPServiceImpl implements PPService {
    public PPMapper getPpMapper() {
        return ppMapper;
    }

    @Inject
    public void setPpMapper(@Named("PPMapper") PPMapper ppMapper) {
        this.ppMapper = ppMapper;
    }

    private PPMapper ppMapper;

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    @Inject
    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    private DateFormat dateFormat;

    @Override
    public List<PrizePunish> findAllPrizeAndPunish() {
        List<PrizePunish> prizePunishList = ppMapper.queryAllPP();
        for(PrizePunish prizePunish:prizePunishList){
            prizePunish.setTime(dateFormat.format(prizePunish.getPpTime()));
        }
        return prizePunishList;
    }

    @Override
    public void deleteById(Integer id){
        ppMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PrizePunish getById(Integer id){
        TbPrizePunish tbPrizePunish = ppMapper.selectByPrimaryKey(id);
        PrizePunish prizePunish = new PrizePunish();

        try {
            BeanUtils.copyProperties(prizePunish,tbPrizePunish);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        prizePunish.setTime(dateFormat.format(prizePunish.getPpTime()));
        return prizePunish;
    }

    @Override
    public void insertOnePrizeAndPunish(PrizePunish ppVo){
        ppMapper.insertSelective(ppVo);
    }

    @Override
    public void updateOnePrizeAndPunishById(Integer id, PrizePunish ppVo){
        ppMapper.updateByPrimaryKeySelective(ppVo);
    }

}
