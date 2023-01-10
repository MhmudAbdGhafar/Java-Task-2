package com.companyname.employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.lang.Integer;
public class Employee {
    private String name;
    private double salary;
    private int id;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
