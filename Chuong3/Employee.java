package Chuong3;

import Chuong3.Employee;

public class Employee {
    private String FullName;
    private int Age;
    private String Salary;

    public Employee(String fullname, int age, String salary) {
        this.FullName = fullname;
        this.Age = age;
        this.Salary = salary;
    }

    public void displayInfo() {
        System.out.println("Full Name: " + FullName);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + Salary);
    }

}