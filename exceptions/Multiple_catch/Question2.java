package exceptions.Multiple_catch;
public class Question2 {
    public static void main(String[] args) {

        try {
            String number = "abc";
            Integer.parseInt(number);
            int result = 10 / 0;  
            System.out.println(result);
        }

        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}