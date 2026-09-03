package exceptions.Try_catch;
public class Question2 {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range.");
        }
    }
}