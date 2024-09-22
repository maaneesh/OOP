package models;

public class NightShiftEmployees  extends Employee{
    public NightShiftEmployees(double salary, double basic, double allowance, double deductions) {
        super(salary,basic,allowance+40, deductions);
    }
}
