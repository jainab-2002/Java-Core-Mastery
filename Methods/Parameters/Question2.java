package Parameters;
public class Question2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before method call: a = " + a + ", b = " + b);
        swapValues(a, b);
        System.out.println("After method call: a = " + a + ", b = " + b);
    }

    public static void swapValues(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside method: x = " + x + ", y = " + y);
    }
}
