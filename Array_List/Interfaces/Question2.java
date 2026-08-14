package Array_List.Interfaces;
interface Calculator {
    int add(int a, int b);
}

class MyCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}

public class Question2 {
    public static void main(String[] args) {

        MyCalculator c = new MyCalculator();

        System.out.println("Sum = " + c.add(10, 20));
    }
}