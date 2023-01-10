package com.companyname.employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
        List<Employee> employeesList = new ArrayList<Employee>();

        initializeEmployeeList(employeesList, 10);

        writeToFile(employeesList);

        readFromFile();
    }

    public static void initializeEmployeeList(List<Employee> employeeList, int size){
        for (int i = 1; i <= size; i++){
            employeeList.add(new Employee(i, "name" + String.valueOf(i), 1000 * i));
        }
    }

    private static void writeToFile(List<Employee> employeesList){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");

            for (Employee employee: employeesList){
                myWriter.write("Id: "+String.valueOf(employee.getId()) + ", ");
                myWriter.write("Name: "+employee.getName() + ", ");
                myWriter.write("Salary: "+String.valueOf(employee.getSalary()));

                myWriter.write(System.lineSeparator());
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void readFromFile(){
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
