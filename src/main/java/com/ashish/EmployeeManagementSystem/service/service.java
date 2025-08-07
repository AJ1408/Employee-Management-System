package com.ashish.EmployeeManagementSystem.service;

import com.ashish.EmployeeManagementSystem.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface service {
    public Employee saveEmp(Employee emp);

    public List<Employee> getAllEmp();

    public Employee getEmpById(int id);

    public Boolean deleteEmp(int id);


}
