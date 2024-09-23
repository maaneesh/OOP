package models.account;

public class Account {
    private static int counter =0;
    private int id;
    private int AccNo;
    private String Name;
    private String MobileNumber;
    private double balance;

    public Account(String name, String mobileNumber, double balance) {
        id = ++counter;
        Name = name;
        MobileNumber = mobileNumber;
        this.balance = balance;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }
    public String toString() {
        return "Name: "+Name + "\n" + MobileNumber+"\nAccount no. " + id+ "\nBalance: " + balance;
    }

    public static void main(String[] args) {
        Account account1 = new SavingsAccount("John Doe", "123-456-7890", 1000);
        System.out.println(account1);
    }
}
