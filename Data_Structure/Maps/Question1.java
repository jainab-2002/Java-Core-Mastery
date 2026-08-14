package Data_Structure.Maps;
import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Priya");

        System.out.println("Student Map: " + students);

        System.out.println("Student with ID 102: " + students.get(102));

        students.remove(103);

        System.out.println("After removing ID 103: " + students);
    }
}