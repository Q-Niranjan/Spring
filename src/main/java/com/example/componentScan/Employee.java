package com.example.componentScan;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    private int EmpId;
    private String name;
    private Double salary;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId=" + EmpId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

