package com.ssm.service.train;

import com.ssm.dao.customdao.TrainMapper;
import com.ssm.pojo.TbTrain;
import com.ssm.pojo.custompojo.Train;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.List;

@Component
public class TrainServiceImpl implements TrainService {
    public TrainMapper getTrainMapper() {
        return trainMapper;
    }

    @Inject
    public void setTrainMapper(TrainMapper trainMapper) {
        this.trainMapper = trainMapper;
    }

    private TrainMapper trainMapper;

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    @Inject
    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    private DateFormat dateFormat;

    @Override
    public List<Train> findAllTrain() {
        List<Train> trainList = trainMapper.queryAllTrain();
        for(Train train:trainList){
            train.setTraintime(dateFormat.format(train.getTnTime()));
        }
        return trainList;
    }

    @Override
    public void deleteById(Integer id) {
        trainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Train getById(Integer id) {
        TbTrain tbTrain = trainMapper.selectByPrimaryKey(id);
        Train train = new Train();

        try {
            BeanUtils.copyProperties(train,tbTrain);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        train.setTraintime(dateFormat.format(train.getTnTime()));
        return train;
    }

    @Override
    public void insertOneTrain(Train trainVo) {
        trainMapper.insertSelective(trainVo);
    }

    @Override
    public void updateOneTrainById(Integer id, Train trainVo) {
        trainMapper.updateByPrimaryKeySelective(trainVo);
    }
}
