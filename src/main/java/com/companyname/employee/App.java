package com.companyname.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        List<Employee> employeesList = new ArrayList<Employee>();
        for (int i = 1; i <= 10; i++){
            employeesList.add(new Employee(i, "name" + String.valueOf(i), 1000 * i));
        }

        for (Employee employee: employeesList){
            employee.print();
        }
    }
}
