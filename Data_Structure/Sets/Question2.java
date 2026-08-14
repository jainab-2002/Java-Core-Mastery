package Data_Structure.Sets;


import java.util.HashSet;

public class Question2 {
    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Rahul");

        System.out.println("Student Names: " + students);

        System.out.println("Number of Students: " + students.size());

        System.out.println("Is Amit present? " + students.contains("Amit"));
    }
}