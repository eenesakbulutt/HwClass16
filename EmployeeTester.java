package com.collection.class17;

public class EmployeeTester {
    public static void main(String[] args) {
      //Create a Class called Employee:
        //Create three  variables  empID , salary and set the CEO to “Sumair”
        //Create two objects of the class Employee
        //Set the value of eID, salary for each of the objects
        //Print out the eID , salary and  CEO for each of the objects






        Employee employee= new Employee();
        employee.empId="132";
        employee.salary=100000;
        System.out.println(employee.empId);
        System.out.println(employee.salary);
        System.out.println(Employee.CEO);
        Employee employee1=new Employee();
        employee1.empId="456";
        employee1.salary=120000;
        System.out.println(employee1.empId);
        System.out.println(employee1.salary);
    }
}
