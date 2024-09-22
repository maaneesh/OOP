package models;

public class Manager extends FulTimeEmployee{
    public Manager(String firstName, String lastName, String address, String pincode) {
        super(firstName, lastName, address, pincode);
    }
    public double calculateSalary() {
        return getBasic()+getAllowance()-getDeductions()+1000;
    }
}
