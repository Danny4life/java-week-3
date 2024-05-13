package week_3_curriculum.class_activity_8A;

public class Person {
    String firstName;

    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void display(){
        System.out.println(firstName + " " + lastName);
    }
}
