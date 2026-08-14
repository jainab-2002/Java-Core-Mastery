package Loops.While_vs_For_Loop;
public class Question1 {
    public static void main(String[] args) {

        // For Loop
        System.out.println("Using For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("Using While Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
    }
}