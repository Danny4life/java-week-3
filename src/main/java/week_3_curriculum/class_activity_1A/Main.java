package week_3_curriculum.class_activity_1A;

public class Main {
    public static void main(String[] args) {
        InternshipForm obj1 = new InternshipForm("John Doe", 21, "Male");
        InternshipForm obj2 = new InternshipForm("Jane Day", 21, "Female");


        System.out.println("Name : " + obj1.name);
        System.out.println("Age : " + obj1.age);
        System.out.println("Gender : " + obj1.gender);
    }
}
