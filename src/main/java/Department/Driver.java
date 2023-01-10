package Department;
import com.companyname.employee.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main( String[] args ) {
        List<Department> departmentList = new ArrayList<Department>();
        List<Employee> employeesList = new ArrayList<Employee>();

        initializeDepartmentList(departmentList, 10);
        initializeEmployeeList(employeesList, 10);

        writeToFile(departmentList, employeesList);

        readFromFile();
    }

    public static void initializeEmployeeList(List<Employee> employeeList, int size){
        for (int i = 1; i <= size; i++){
            employeeList.add(new Employee(i, "name" + String.valueOf(i), 1000 * i));
        }
    }

    public static void initializeDepartmentList(List<Department> departmentList, int size){
        for (int i = 1; i <= size; i++){
            departmentList.add(new Department("Department" + String.valueOf(100 + i), 100 + i));
        }
    }

    private static void writeToFile(List<Department> departmentList, List<Employee> employeesList){
        try {
            FileWriter myWriter = new FileWriter("filename.txt");

            for (int i = 0 ; i < employeesList.size(); i++){

                myWriter.write("EmployeeId: "+String.valueOf(employeesList.get(i).getId()) + ", ");
                myWriter.write("EmployeeName: "+employeesList.get(i).getName() + ", ");
                myWriter.write("EmployeeSalary: "+String.valueOf(employeesList.get(i).getSalary()) + "\t");

                myWriter.write("DepartmentId: "+String.valueOf(departmentList.get(i).getId()) + ", ");
                myWriter.write("DepartmentName: "+departmentList.get(i).getName() + ", ");

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
