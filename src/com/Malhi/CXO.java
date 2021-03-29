package com.Malhi;

public class CXO extends Manager{
        private double intencive;

    public CXO(int employeeId, String empName, double hourlyrate, String manager, double bonus, double intencive) {
        super(employeeId, empName, hourlyrate, manager, bonus);
        this.intencive = intencive;
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() + intencive;
    }
}
