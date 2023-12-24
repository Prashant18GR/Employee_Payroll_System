package com.luv2code.eps.EmployeePayrollsystem.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
@Table(name= "info")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="name")
    private String name;

    @Column(name="job")
    private String job;

    @Column(name="branch")
    private String branch;



    @Column(name="salary")
    private int salary;

    //constructor
    public Employee(){

    }

    public Employee(String name, String job, String branch, int salary) {
        this.name = name;
        this.job = job;
        this.branch = branch;
        this.salary = salary;
    }

    //GetterSetter


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", branch='" + branch + '\'' +
                ", salary=" + salary +
                '}';
    }
}
