package week_3_curriculum.class_activity_15A;

public class SplitEx {
    public static void main(String[] args) {
        String s1 = "This is a java split method example";

        System.out.println("Before splitting : " + s1);

        String[] words = s1.split("\\s");

        for(String y : words){
            System.out.println(y);
        }
    }
}
