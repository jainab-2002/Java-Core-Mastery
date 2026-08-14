package Array_List.Array_List_Methods;
import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        // get()
        System.out.println("First fruit: " + fruits.get(0));

        // set()
        fruits.set(1, "Orange");
        System.out.println("After changing: " + fruits);

        // remove()
        fruits.remove("Mango");
        System.out.println("After removing: " + fruits);

        // size()
        System.out.println("Size: " + fruits.size());

        // contains()
        System.out.println("Contains Apple: " + fruits.contains("Apple"));
    }
}