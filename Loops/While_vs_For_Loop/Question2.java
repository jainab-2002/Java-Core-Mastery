package Loops.While_vs_For_Loop;
public class Question2 {
    public static void main(String[] args) {

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        System.out.println("\nWhile Loop:");
        int j = 1;

        while (j <= 5) {
            System.out.println("10 x " + j + " = " + (10 * j));
            j++;
        }
    }
}