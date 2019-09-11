package com.zian.testresult.controller;

import com.zian.testresult.dao.DepartmentDao;
import com.zian.testresult.dao.EmployeeDao;
import com.zian.testresult.entities.Department;
import com.zian.testresult.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class EmpController {
    @Autowired
    EmployeeDao emps;
    @Autowired
    DepartmentDao departmentDao;
    @GetMapping("/emps")
    public String lists(Model model){
        Collection<Employee> ss=emps.getAll();
        model.addAttribute("emps",ss);
        return "emp/list";
    }
    /*
    *添加员工
    * */
    @PostMapping("/addemp")
    public String addEmp(Employee employee , BindingResult bindingResult){
        System.out.println("新增员工信息为："+employee.toString());
        emps.save(employee);
        //redirect：重定向
        //forward  转发
        //  /代表当前项目
        return "redirect:/emps";
    }

    /*添加员工按钮*/
    @GetMapping("/emp")
    public String taddPage(Model model){
        /*跳转到添加员工页面*/
        Collection<Department> departments= departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        System.out.println("进入跳转的方法，获取的部门数据："+departments);
        return "emp/add";
    }

    /**
     * 来到修改页面，查出员工信息,并回显
     * */
    @GetMapping("/emp/{id}")
    public String  toEmpPage(@PathVariable("id") Integer id,Model model)
    {
        //查出员工并添加到model中
        Employee employee=emps.get(id);
        System.out.println("获取的信息"+employee);
        model.addAttribute("emp",employee);
        Collection<Department> departments= departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        System.out.println("呵呵大");
        return "emp/add";
    }
}
