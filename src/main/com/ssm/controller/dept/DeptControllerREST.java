package com.ssm.controller.dept;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ssm.pojo.custompojo.Department;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;

import com.ssm.service.dept.DeptService;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/dept/rest")
public class DeptControllerREST {
    private DeptService deptSer;

    public ObjectMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(@Named("jsonMapper") ObjectMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    private ObjectMapper jsonMapper;

    public DeptService getDeptSer() {
        return deptSer;
    }

    @Inject
    public void setDeptSer(@Named("deptServiceImpl") DeptService deptSer) {
        this.deptSer = deptSer;
    }


    @RequestMapping(value = "/test",produces = "application/json;charset=UTF-8")
    public ObjectNode deptTest(){
        ObjectNode result = jsonMapper.createObjectNode();

        List<Department> deptList = deptSer.findAllDepts();
        ArrayNode jnode=null;
        try {
//             str = jsonMapper.writerWithView(Department.Views.QueryView.class).writeValueAsString(deptList);
             jnode = (ArrayNode) jsonMapper.readTree(
                     jsonMapper.writerWithView(Department.Views.QueryView.class).writeValueAsString(deptList));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        ArrayNode arrayNodde = jsonMapper.valueToTree(deptList);//The way to convert IO container types into json tree structure

        result.put("Title","All Department Data");
//        result.putArray("data").addAll(arrayNode);
        result.putArray("data").addAll(jnode);

        return result;
    }

    @RequestMapping(value = "/queryAll",produces = "application/json;charset=UTF-8")
    @JsonView(Department.Views.QueryView.class)
    public List<Department> queryAll(){
        return deptSer.findAllDepts();
    }

    @RequestMapping("/delete")
//    @JsonView(Department.Views.QueryView.class)
    public void deleteOne(@RequestParam("id") Integer id){
        deptSer.deleteById(id);
//        return deptQueryAll();
    }

    @RequestMapping("/getbyid/{id}")
    @JsonView(Department.Views.QueryView.class)
    public Department getById(@PathVariable("id") Integer id){
        return deptSer.findById(id);
    }

    @RequestMapping("/addsubmission")
    public void addSubmission(Department deptVo){
        deptVo.setDtResponsibility(deptVo.getDtResponsibility().replaceAll("[\\r\\n]",""));
        Integer id = deptVo.getId(); //Use the id named input element on the page to distinguish whether it is an insertion or update
        if(id == null){ //Insert A New Table Row
            deptSer.insertOneDept(deptVo);
        } else { //Update an Existing Department
            deptSer.updateById(id,deptVo);
        }
    }
}
