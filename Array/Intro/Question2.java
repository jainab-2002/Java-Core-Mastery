package Array.Intro;
public class Question2 {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 30, 15};

        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number = " + largest);
    }
}