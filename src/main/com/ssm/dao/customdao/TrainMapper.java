package com.ssm.dao.customdao;

import com.ssm.dao.TbTrainMapper;
import com.ssm.pojo.custompojo.Train;

import java.util.List;

public interface TrainMapper extends TbTrainMapper {
    List<Train> queryAllTrain();
}
