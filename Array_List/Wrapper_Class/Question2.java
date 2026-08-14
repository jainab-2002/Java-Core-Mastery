package Array_List.Wrapper_Class;
public class Question2 {
    public static void main(String[] args) {

        // Autoboxing: int to Integer
        int a = 50;
        Integer number = a;

        // Unboxing: Integer to int
        Integer x = 100;
        int b = x;

        System.out.println("Autoboxing: " + number);
        System.out.println("Unboxing: " + b);
    }
}