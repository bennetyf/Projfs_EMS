package com.ssm.service.train;

import com.ssm.pojo.custompojo.Train;

import java.util.List;

public interface TrainService{
    List<Train> findAllTrain();
    void deleteById(Integer id);
    Train getById(Integer id);
    void insertOneTrain(Train trainVo);
    void updateOneTrainById(Integer id, Train trainVo);
}
