package Array_List.Array_LIsts;
import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        // Adding elements
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Neha");

        System.out.println("Students: " + students);

        // Checking an element
        System.out.println("Is Amit present? " + students.contains("Amit"));

        // Getting an element
        System.out.println("Student at index 2: " + students.get(2));

        // Removing an element
        students.remove("Neha");
        System.out.println("After removing Neha: " + students);

        // Finding size
        System.out.println("Number of students: " + students.size());

        // Clearing the list
        students.clear();
        System.out.println("After clear: " + students);
    }
}