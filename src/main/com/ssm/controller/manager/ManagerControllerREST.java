package com.ssm.controller.manager;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssm.pojo.custompojo.Manager;
import com.ssm.service.manager.ManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;

@RestController
@RequestMapping("/manager/rest")
public class ManagerControllerREST {
    public ObjectMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(ObjectMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    public ManagerService getManagerService() {
        return managerService;
    }

    @Inject
    public void setManagerService(@Named("managerServiceImpl") ManagerService managerService) {
        this.managerService = managerService;
    }

    private ObjectMapper jsonMapper;
    private ManagerService managerService;

    @RequestMapping("/delete")
    public void deleteOne(@RequestParam("id") Integer id){
        managerService.deleteById(id);
    }

    @RequestMapping(value = "/getbyid",produces = "application/json;charset=UTF-8")
    @JsonView(Manager.Views.DetailsView.class)
    public Manager getById(@RequestParam("id") Integer id){
        return managerService.getById(id);
    }

    @RequestMapping("/addsubmission")
    public void addSubmission(Manager managerVo){
        Integer id = managerVo.getId();
        if(id == null){
            managerService.insertOneManager(managerVo);
        }else{
            managerService.updateOneManagerById(id, managerVo);
        }
    }
}
