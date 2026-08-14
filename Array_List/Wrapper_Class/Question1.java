package Array_List.Wrapper_Class;

public class Question1 {
    public static void main(String[] args) {

        int a = 10;
        double b = 20.5;

        // Converting primitive types into wrapper objects
        Integer num1 = Integer.valueOf(a);
        Double num2 = Double.valueOf(b);

        System.out.println("Integer: " + num1);
        System.out.println("Double: " + num2);
    }
}