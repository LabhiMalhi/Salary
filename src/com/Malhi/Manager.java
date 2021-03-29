package com.Malhi;

public class Manager extends Employee{
    private double bonus;

    public Manager(int employeeId, String empName, double hourlyrate, String manager, double bonus) {
        super(employeeId, empName,  hourlyrate, manager);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary()+ bonus;
    }
}
