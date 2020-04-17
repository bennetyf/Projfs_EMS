package com.ssm.controller.dept;

import com.ssm.pojo.custompojo.Department;
import com.ssm.service.dept.DeptService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import javax.inject.Named;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {
    private DeptService deptSer;

    public DeptController() {
    }

    public DeptService getDeptSer() {
        return deptSer;
    }

    @Inject
    public void setDeptSer(@Named("deptServiceImpl") DeptService deptServiceImpl) {
        this.deptSer = deptServiceImpl;
    }

    @RequestMapping("/queryAll")
    public String deptQueryAll(Model model){
        List<Department> deptList = deptSer.findAllDepts();
        model.addAttribute("deptList", deptList);
        return "Dept/QueryAll";
    }

    @RequestMapping("/delete")
    public String deptDeleteOne(@RequestParam("id") Integer id){
        deptSer.deleteById(id);
        return "redirect: queryAll";
    }

    @RequestMapping("/update")
    public String deptUpdateOne(@RequestParam("id") Integer id, RedirectAttributes model){
        Department temp = deptSer.findById(id);
        model.addFlashAttribute("dept",temp);
        return "redirect:add";
    }

    @RequestMapping("/add")
    public String deptToAddOne(@ModelAttribute("dept") Department dept){
        return "Dept/AddOne";
    }

    @RequestMapping("/addSubmission")
    public String deptAddSubmission(Department deptVo){
        deptVo.setDtResponsibility(deptVo.getDtResponsibility().replaceAll("[\\r\\n]",""));
        Integer id = deptVo.getId();
        if(id == null){ //Insert A New Table Row
            deptSer.insertOneDept(deptVo);
        } else { //Update an Existing Department
            deptSer.updateById(id,deptVo);
        }
        return "redirect: queryAll";
    }
}
