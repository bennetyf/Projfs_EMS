package com.ssm.dao;

import com.ssm.pojo.TbPrizePunish;
import com.ssm.pojo.TbPrizePunishExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPrizePunishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    long countByExample(TbPrizePunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int deleteByExample(TbPrizePunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int insert(TbPrizePunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int insertSelective(TbPrizePunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    List<TbPrizePunish> selectByExampleWithBLOBs(TbPrizePunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    List<TbPrizePunish> selectByExample(TbPrizePunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    TbPrizePunish selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int updateByExampleSelective(@Param("record") TbPrizePunish record, @Param("example") TbPrizePunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TbPrizePunish record, @Param("example") TbPrizePunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int updateByExample(@Param("record") TbPrizePunish record, @Param("example") TbPrizePunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int updateByPrimaryKeySelective(TbPrizePunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int updateByPrimaryKeyWithBLOBs(TbPrizePunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_prize_punish
     *
     * @mbg.generated Mon Dec 17 21:12:54 AEDT 2018
     */
    int updateByPrimaryKey(TbPrizePunish record);
}