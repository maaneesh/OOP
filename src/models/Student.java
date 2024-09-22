package models;

import java.sql.Array;

public class Student {
    private int StudentId;
    private String name;
    private String mobileNo;
    private String address;
    private String Course;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validateName(name)) {
            this.name = name;

        }else throw  new IllegalArgumentException("Name cannot be longer than 15 characters.");

    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        if (validateMobileNo(mobileNo)) {
            this.mobileNo = mobileNo;

        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
    private boolean validateName(String name){
        return name.length() <= 15;
    }
    private boolean validateMobileNo(String mobileNo){
        return mobileNo.length() <= 10;
    }

    public float calculateFee(String[] course){
        float fee = 0f;
       for (int i = 0; i < course.length; i++) {
           fee += 1000f;
       }
        return fee;

    }
    public   static String toString(Student student){
        return " Name: "+student.getName()+"\n MobileNo: "+student.getMobileNo()+"\n Address: "+student.getAddress();
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("manish");
        student1.setMobileNo("3474394690");

        String[] courses = {"CSCI", "Database", "Algebra"};
        float fee = student1.calculateFee(courses);


        System.out.println(Student.toString(student1));
        System.out.println("total fee: "+ fee);

        CorporateBatchStudent student2 = new CorporateBatchStudent();
        student2.setName("manish");
        student2.setMobileNo("3474394690");
        System.out.println("Salary: "+ student2.calculateFee(courses));
    }

}
