package Strings.Methods_Str;

public class Question1 {
    public static void main(String[] args) {

        String str = "Hello, World!";

        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("String in uppercase: " + str.toUpperCase());
        System.out.println("String in lowercase: " + str.toLowerCase());

    }
}