package models;

public class Employee {
    private static int counter = 0;
    private int emplId;
    private double salary=0;
    private double basic;
    private double allowance;
    private double deductions;
    private String firstName;
    private String lastName;
    private String address;
    private String pinCode;

    public Employee() {
        this.emplId = ++counter;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.pinCode = "";
    }

    public Employee(String firstName, String lastName, String address, String pinCode) {
        this.emplId = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pinCode = pinCode;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmplId() {
        return emplId;
    }

    public void setEmplId(int emplId) {
        this.emplId = emplId;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


}
