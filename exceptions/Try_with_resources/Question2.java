package exceptions.Try_with_resources;
import java.io.FileReader;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {

        try (FileReader file = new FileReader("test.txt")) {

            int data;

            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }

        }
        catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
};