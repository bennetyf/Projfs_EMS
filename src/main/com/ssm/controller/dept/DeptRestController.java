package com.ssm.controller.dept;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ssm.pojo.custompojo.Department;
import com.ssm.service.dept.DeptService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RestController
@RequestMapping("/dept/rest")
public class DeptRestController {
    private DeptService deptSer;

    public ObjectMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(ObjectMapper objectMapper) {
        this.jsonMapper = objectMapper;
    }

    private ObjectMapper jsonMapper;

    public DeptRestController() {
    }

    public DeptService getDeptSer() {
        return deptSer;
    }

    @Inject
    public void setDeptSer(@Named("deptServiceImpl") DeptService deptServiceImpl) {
        this.deptSer = deptServiceImpl;
    }

    @RequestMapping(value = "/queryAll",produces = "application/json;charset=UTF-8")
    public ObjectNode deptQueryAll() {
        ObjectNode out = jsonMapper.createObjectNode();
        ArrayNode arrayNode = null;
        List<Department> queryList = deptSer.findAllDepts();

        try {
            arrayNode =
                    (ArrayNode) jsonMapper.readTree(
                    jsonMapper.writerWithView(Department.Views.QueryView.class).writeValueAsString(queryList)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        out.put("Results From QueryAll","Data List");
        out.putArray("data").addAll(arrayNode);
        return out;
    }

    @RequestMapping("/delete")
    public void deptDeleteOne(@RequestParam("id") Integer id){
        deptSer.deleteById(id);
    }

    @RequestMapping(value = "/update",produces = "application/json;charset=UTF-8")
    @JsonView(Department.Views.QueryView.class)
    public Department deptUpdateOne(@RequestParam("id") Integer id){
        return deptSer.findById(id);
    }

    @RequestMapping(value = "/addSubmission")
    public void deptAddSubmission(Department deptVo){
        deptVo.setDtResponsibility(deptVo.getDtResponsibility().replaceAll("[\\r\\n]",""));
        Integer id = deptVo.getId();
        if(id == null){ //Insert A New Table Row
            deptSer.insertOneDept(deptVo);
        } else { //Update an Existing Department
            deptSer.updateById(id,deptVo);
        }
    }
}
