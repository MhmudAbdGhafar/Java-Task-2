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

    public void print(){
        writeToFile();
        readFromFile();
    }
    private void writeToFile(){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");

            myWriter.write("Id: "+String.valueOf(id) + ", ");
            myWriter.write("Name: "+name + ", ");
            myWriter.write("Salary: "+String.valueOf(salary));

            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    private void readFromFile(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);

            String data = myReader.nextLine();
            System.out.println(data);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
