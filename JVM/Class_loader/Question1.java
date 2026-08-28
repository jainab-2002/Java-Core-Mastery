package JVM.Class_loader;
public class Question1 {
    public static void main(String[] args) throws Exception {

        // Load the String class dynamically
        Class<?> clazz = Class.forName("java.lang.String");

        System.out.println("Class loaded: " + clazz.getName());
        System.out.println("Class loader: " + clazz.getClassLoader());
    }
}
