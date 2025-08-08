package com.ashish.EmployeeManagementSystem.controller;

import com.ashish.EmployeeManagementSystem.entity.Employee;
import com.ashish.EmployeeManagementSystem.service.service;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private service service;

    @GetMapping("/")
    public String index(Model m) {
        List<Employee> list = service.getAllEmp();
        m.addAttribute("empList" ,list);
        System.out.println("index called");
        return "index"; // Loads index.html from src/main/resources/templates/
    }

    @GetMapping("/save")
    public String empSave() {
        System.out.println("save called");
        return "emp_save"; // Loads emp_save.html from templates

    }

    @GetMapping("/edit")
    public String editFallback() {
        System.out.println("edit called");
        return "error"; // or wherever you want to redirect
    }


    @GetMapping("/edit/{id}")
    public String empEdit(@PathVariable int id, Model model, HttpSession session) {
        Employee empById = service.getEmpById(id);

        if (empById == null) {
            session.setAttribute("msg", "Employee not found with ID: " + id);
            return "redirect:/";
        }

        model.addAttribute("empById", empById);
        return "edit_emp";
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

    @PostMapping("/updateEmp")
    public  String updateEmp(@ModelAttribute Employee emp , HttpSession session) {   // binding this with same name as employee to emp_save
        System.out.println(emp);

        Employee Emp = service.saveEmp(emp);
        if (Emp != null) {
            session.setAttribute("msg", "Updated successfully");
        } else {
            session.setAttribute("msg", "Something went wrong");
        }
//        return "emp_save" ;
        return "redirect:/?success";
    }

    @GetMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable int id, HttpSession session) {
        Boolean delete = service.deleteEmp(id);

        if (delete) {
            session.setAttribute("msg", "deleted successfully");
        }
        return "redirect:/";
    }
}