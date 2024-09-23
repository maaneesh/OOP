package models.account;

public class SavingsAccount extends Account {
    private float interestRate;

    public SavingsAccount(String name, String mobileNo, double balance) {
        super(name, mobileNo, balance);

    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

}

