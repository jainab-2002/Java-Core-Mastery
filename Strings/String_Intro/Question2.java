package Strings.String_Intro;

public class Question2 {
    public static void main(String[] args) {

        String firstName = "Amit";
        String lastName = "Kumar";

        String fullName = firstName + " " + lastName;

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Full Name: " + fullName);
        System.out.println("Name Length: " + fullName.length());
    }
}