package Data_Structure.Maps;
import java.util.HashMap;

public class Question2 {
    public static void main(String[] args) {

        HashMap<String, Integer> employees = new HashMap<>();

        employees.put("raaj", 30000);
        employees.put("Amyra", 25000);
        employees.put("Priti", 35000);

        System.out.println("Employee Details:");

        for (String name : employees.keySet()) {
            System.out.println(name + " = " + employees.get(name));
        }
    }
}