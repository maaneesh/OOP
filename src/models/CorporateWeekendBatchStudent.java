package models;

public class CorporateWeekendBatchStudent extends Student {

    public CorporateWeekendBatchStudent() {
        super();

    }

    @Override
    public float calculateFee(String[] course) {
        float salary = super.calculateFee(course);
        return  salary;
    }
}
