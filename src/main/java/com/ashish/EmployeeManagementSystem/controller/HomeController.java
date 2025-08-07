package com.ashish.EmployeeManagementSystem.controller;

import com.ashish.EmployeeManagementSystem.entity.Employee;
import com.ashish.EmployeeManagementSystem.service.service;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    private service service;

    @GetMapping("/")
    public String index() {
        System.out.println("index called");
        return "index"; // Loads index.html from src/main/resources/templates/
    }

    @GetMapping("/save")
    public String empSave() {
        System.out.println("save called");
        return "emp_save"; // Loads emp_save.html from templates
    }

    @GetMapping("/edit")
    public String empEdit() {
        System.out.println("edit called");
        return "edit_emp"; // Changed to match your file name: edit_emp.html
    }

    @PostMapping("/saveEmp")
    public  String SaveEmp(@ModelAttribute Employee emp , HttpSession session){   // binding this with same name as employee to emp_save
        System.out.println(emp);

        Employee newEmp = service.saveEmp(emp);
        if(newEmp != null){
            session.setAttribute("msg" ,"Successfully Registered");
        }
        else{
            session.setAttribute("msg" ,"Something went wrong");
        }
//        return "emp_save" ;
        return "redirect:/save?success";
    }
}