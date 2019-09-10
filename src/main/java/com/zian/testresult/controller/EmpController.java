package com.zian.testresult.controller;

import com.zian.testresult.dao.EmployeeDao;
import com.zian.testresult.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmpController {
    @Autowired
    EmployeeDao emps;
    @GetMapping("/emps")
    public String lists(Model model){
        Collection<Employee> ss=emps.getAll();
        model.addAttribute("emps",ss);
        return "emp/list";
    }

    public String s(){
        return "";
    }

}
