package com.ssm.controller.train;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ssm.pojo.custompojo.Train;
import com.ssm.service.train.TrainService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/train/rest")
public class TrainControllerREST {
    private ObjectMapper jsonMapper;

    public TrainService getTrainService() {
        return trainService;
    }

    @Inject
    public void setTrainService(@Named("trainServiceImpl") TrainService trainService) {
        this.trainService = trainService;
    }

    private TrainService trainService;

    public ObjectMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(ObjectMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    @RequestMapping(value = "/queryAll", produces = "application/json;charset=UTF-8")
    public ObjectNode queryAll(){
        ObjectNode result = jsonMapper.createObjectNode();
        ArrayNode arrayNode = null;

        List<Train> list = trainService.findAllTrain();

        try {
            arrayNode = (ArrayNode) jsonMapper.readTree(
                    jsonMapper.writerWithView(Train.Views.QueryView.class).writeValueAsString(list));
        } catch (IOException e) {
            e.printStackTrace();
        }

        result.put("Title","All Trainings");
        result.putArray("data").addAll(arrayNode);
        return result;
    }

    @RequestMapping("/delete")
    public void deleteOne(@RequestParam("id") Integer id){
        trainService.deleteById(id);
    }

    @RequestMapping("/getbyid/{id}")
    @JsonView(Train.Views.QueryView.class)
    public Train getById(@PathVariable("id") Integer id){
        return trainService.getById(id);
    }

    @RequestMapping("/addsubmission")
    public void addSubmission(Train trainVo){
        Integer id = trainVo.getId();
        if(id == null){
            trainService.insertOneTrain(trainVo);
        }else{
            trainService.updateOneTrainById(id,trainVo);
        }
    }
}
