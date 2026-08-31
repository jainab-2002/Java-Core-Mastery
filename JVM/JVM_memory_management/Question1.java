package JVM.JVM_memory_management;
public class Question1 {
    public static void main(String[] args) {

        Question1 obj = new Question1();

        obj = null;

        Question1 obj2 = new Question1();

        System.gc();

        System.out.println("Garbage collection requested");
    }
}