package week_3_curriculum.class_activity_11A;

public class Developers {
    int id;
    String name;

    String institute;

    public Developers(int id, String name, String institute) {
        this.id = id;
        this.name = name;
        this.institute = institute;

    }

    void display(){
        System.out.println(id + " " + name + " " + institute);
    }
}
