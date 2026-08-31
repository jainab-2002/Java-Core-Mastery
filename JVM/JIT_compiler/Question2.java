package JVM.JIT_compiler;

public class Question2 {
    static int calculate() {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
           sum += i;      
         }
         return sum;
    }
    int sum = 0;
   
    public static void main(String[] args) {

        for (int i=1; i<=100; i++) {
            int result = calculate();
            System.out.println("Result: " + result);
        }
    }
}