package Variables_Datatypes.Operators;


public class Question2 {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));

       
        a += 5;
        System.out.println("After a += 5: " + a);

        b++;
        System.out.println("After b++: " + b);

        b--;
        System.out.println("After b--: " + b);
    }
}