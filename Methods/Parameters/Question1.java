package Parameters;
public class Question1 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before method call: " + x);
        modifyValue(x);
        System.out.println("After method call: " + x);
    }

    public static void modifyValue(int value) {
        value = 20;
        System.out.println("Inside method: " + value);
    }
}