package com.ashish.EmployeeManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

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
}