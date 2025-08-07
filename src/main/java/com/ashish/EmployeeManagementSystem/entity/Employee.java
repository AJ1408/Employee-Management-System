package com.ashish.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(length = 150)
    private String name;
    private String email;
    private String address;
    private String gender;
    private String password;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
