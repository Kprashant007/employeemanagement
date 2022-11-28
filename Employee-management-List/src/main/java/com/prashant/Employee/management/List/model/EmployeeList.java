package com.prashant.Employee.management.List.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class EmployeeList {

    private long id;
    @Nonnull
    private String title;
    private String dept;
    private long salary;

    public EmployeeList() {
    }

    public EmployeeList(long id, String title, String dept,long salary) {
        this.id = id;
        this.title = title;
        this.dept = dept;
        this.salary = salary;
    }

    @Id
    @GeneratedValue
    public long getId() {

         return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
