package com.ashish.EmployeeManagementSystem.repo;

import com.ashish.EmployeeManagementSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface repo extends JpaRepository<Employee,Integer> {

}
