package Data_Structure.Sets;

import java.util.HashSet;

public class Question1 {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana");

        System.out.println("After removing Banana: " + fruits);
    }
}