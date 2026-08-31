package Variable_Scope;
public class Question2 {
    public static void main(String[] args) {
        int a = 10;

        if (a > 5) {
            int b = 20;
            System.out.println("Inside if block: a = " + a + ", b = " + b);
        }
        System.out.println("Outside if block: a = " + a);
    }
}