package models;

public class Employee {
    private static int counter = 0;
    private int emplId;
    private double salary = 0;
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
    public Employee(double salary, double basic, double allowance, double deductions) {
        this.emplId = ++counter;
        this.salary = salary;
        this.basic = basic;
        this.allowance = allowance;
        this.deductions = deductions;

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


    public void setRealName(String firstName, String lastName) {
        this.firstName = firstName;
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

    public double calcSalary() {
        return basic + allowance - deductions;
    }
    public String toString() {
        return "ID: "+emplId+"\nName: "+firstName+" "+lastName+"\nAddress: "+address;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee(1000,800 ,250,300);
        employee1.setRealName("Manish", "Chaudhari");
        employee1.setAddress("Queens");

        Employee employee2 = new PartTimeEmployee(1000,800 ,250,300);
        employee2.setRealName("Manish", "Tharu");
        employee2.setAddress("Woodside");

        Employee nightEmployee = new NightShiftEmployees(1000,800 ,250,300);

        System.out.println(employee1+"\nSalary: "+employee1.calcSalary());
        System.out.println(employee2+"\nSalary: "+employee2.calcSalary());
        System.out.println(nightEmployee+"\nSalary: "+nightEmployee.calcSalary());

       Manager manager1 = new Manager(4500,400,50,450);
        manager1.setBasic(1000);
        manager1.setAllowance(100);
        manager1.setDeductions(100);
        System.out.println(manager1+"\nSalary: "+manager1.calcSalary());


    }


}
