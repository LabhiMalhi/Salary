package com.Malhi;

public class Employee {
    int employeeId;
    String empName;
    String tittle = "Employee";
    double hourlyrate;
    String manager;
    double calculateSalary(){
        return 21*8*hourlyrate;
    }

    public Employee(int employeeId, String empName,  double hourlyrate, String manager) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.tittle = tittle;
        this.hourlyrate = hourlyrate;
        this.manager = manager;
    }

    public void display(){
        System.out.println("Employee Id => " + employeeId);
        System.out.println("Employee Name => " + empName);
        System.out.println("Employee Tittle => " + tittle);
        System.out.println("Employee Salary => " + calculateSalary());
        System.out.println(tittle.equals("Employee")?"Employee Manager : " + manager : "");
    }
}
