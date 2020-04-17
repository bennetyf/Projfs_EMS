package com.ssm.controller.employ;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ssm.pojo.custompojo.Employee;
import com.ssm.service.emp.EmployeeService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/employee/rest")
public class EmpControllerREST {
    private ObjectMapper jsonMapper;
    private EmployeeService employService;

    public ObjectMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(ObjectMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    public EmployeeService getEmployService() {
        return employService;
    }

    @Inject
    public void setEmployService(@Named("employeeServiceImpl") EmployeeService employService) {
        this.employService = employService;
    }

    @RequestMapping(value = "/queryAll", produces = "application/json;charset=UTF-8")
    public ObjectNode queryAll(){
        ObjectNode result = jsonMapper.createObjectNode();
        ArrayNode arrayNode = null;

        List<Employee> list = employService.findAllEmployee();

        try {
            arrayNode = (ArrayNode) jsonMapper.readTree(
                        jsonMapper.writerWithView(Employee.Views.QueryView.class).writeValueAsString(list));
        } catch (IOException e) {
            e.printStackTrace();
        }

        result.put("Title","All Employee Data");
        result.putArray("data").addAll(arrayNode);

        return result;
    }

    @RequestMapping("/delete")
    public void deleteOne(@RequestParam("id") Integer id){
        employService.deleteById(id);
    }

    @RequestMapping(value = "/getbyid/{id}",produces = "application/json;charset=UTF-8")
    @JsonView(Employee.Views.QueryView.class)
    public Employee getById(@PathVariable("id") Integer id){
        return employService.findById(id);
    }

    @RequestMapping("/addsubmission")
    public void addSubmission(Employee employeeVo){
        Integer id = employeeVo.getId();
        if(id == null){
            employService.insertOneEmployee(employeeVo);
        }else{
            employService.updateOneEmployeeById(id, employeeVo);
        }
    }

}
