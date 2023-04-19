package com.blankdev.basiccrud.entity;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeName;
    private float employeeSalary;

    public Employee() {
    }

    public Employee(Long id, String employeeName, float employeeSalary) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public Employee(String employeeName, float employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public float getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
