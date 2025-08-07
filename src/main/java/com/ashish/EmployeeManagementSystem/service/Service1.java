package com.ashish.EmployeeManagementSystem.service;

import com.ashish.EmployeeManagementSystem.entity.Employee;
import com.ashish.EmployeeManagementSystem.repo.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Service1 implements service{
    @Autowired
    private repo empRepo;
    @Override
    public Employee saveEmp(Employee emp) {
        Employee newEmp;
        newEmp = empRepo.save(emp);
        return newEmp;
    }

    @Override
    public List<Employee> getAllEmp() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmpById(int id) {
        return empRepo.findById(id).get();
    }



    @Override
    public Boolean deleteEmp(int id) {
        Employee emp = empRepo.findById(id).get();
        if(emp != null){
            empRepo.delete(emp);
            return true;
        }
        return false;
    }
}
