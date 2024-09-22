package models.employee;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(double salary, double basic, double allowance, double deductions) {
        super(salary, basic, allowance, deductions);
    }

    public double calcSalary() {

        //multiplied by 0.75 because part-time employees work fewer hours
        return (double) ((float) (getBasic() + getAllowance())*0.75 - getDeductions());
    };
}
