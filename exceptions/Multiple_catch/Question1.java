package exceptions.Multiple_catch;
class Question1 {
    
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range.");
        }
    }
}