package com.ssm.controller.invitejob;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ssm.pojo.custompojo.Employee;
import com.ssm.pojo.custompojo.Invitejob;
import com.ssm.service.invite.InviteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/invite/rest")
public class InviteControllerREST {
    private ObjectMapper jsonMapper;
    private InviteService inviteService;

    public InviteService getInviteService() {
        return inviteService;
    }

    @Inject
    public void setInviteService(@Named("inviteServiceImpl") InviteService inviteService) {
        this.inviteService = inviteService;
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

        List<Invitejob> list = inviteService.findAllInvited();

        try {
            arrayNode = (ArrayNode) jsonMapper.readTree(
                    jsonMapper.writerWithView(Invitejob.Views.QueryView.class).writeValueAsString(list));
        } catch (IOException e) {
            e.printStackTrace();
        }

        result.put("Title","All Invited Employee Data");
        result.putArray("data").addAll(arrayNode);
        return result;
    }

    @RequestMapping("/delete")
    public void deleteOne(@RequestParam("id") Integer id){
        inviteService.deleteById(id);
    }

    @RequestMapping(value = "/getbyid/{id}",produces = "application/json;charset=UTF-8")
    @JsonView(Invitejob.Views.QueryView.class)
    public Invitejob getById(@PathVariable("id") Integer id){
        return inviteService.getById(id);
    }

    @RequestMapping("/addsubmission")
    public void addSubmission(Invitejob invitejobVo){
        Integer id = invitejobVo.getId();
        if(id == null){
            inviteService.insertOneInvited(invitejobVo);
        }else{
            inviteService.updateOneInvitedById(id, invitejobVo);
        }
    }

    @RequestMapping("/employ")
    public void employOne(@RequestParam("id") Integer invitedId, Employee employeeVo){
        inviteService.employOneInvited(invitedId,employeeVo);
    }
}
