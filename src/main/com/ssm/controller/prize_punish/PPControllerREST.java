package com.ssm.controller.prize_punish;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ssm.pojo.custompojo.PrizePunish;
import com.ssm.service.prize_punish.PPService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/prizeandpunish/rest")
public class PPControllerREST {
    private ObjectMapper jsonMapper;
    private PPService ppService;

    public PPService getPpService() {
        return ppService;
    }

    @Inject
    public void setPpService(@Named("PPServiceImpl") PPService ppService) {
        this.ppService = ppService;
    }

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

        List<PrizePunish> list = ppService.findAllPrizeAndPunish();

        try {
            arrayNode = (ArrayNode) jsonMapper.readTree(
                    jsonMapper.writerWithView(PrizePunish.Views.QueryView.class).writeValueAsString(list));
        } catch (IOException e) {
            e.printStackTrace();
        }

        result.put("Title","All Prize And Punishment");
        result.putArray("data").addAll(arrayNode);
        return result;
    }

    @RequestMapping("/delete")
    public void deleteOne(@RequestParam("id") Integer id){
        ppService.deleteById(id);
    }

    @RequestMapping("/getbyid")
    @JsonView(PrizePunish.Views.QueryView.class)
    public PrizePunish getById(@RequestParam("id") Integer id){
        return ppService.getById(id);
    }

    @RequestMapping("/addsubmission")
    public void addSubmission(PrizePunish prizePunishVo){
        Integer id = prizePunishVo.getId();
        if(id == null){
            ppService.insertOnePrizeAndPunish(prizePunishVo);
        }else{
            ppService.updateOnePrizeAndPunishById(id,prizePunishVo);
        }
    }
}
