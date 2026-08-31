package JVM.JVM_memory_management;
public class Question2 {
    public static void main(String[] args) {

        Question2 obj = new Question2();
        Question2 obj2 = new Question2();

        obj = null; 
        obj2 = null;  
        System.gc();

        System.out.println("Objects are eligible for garbage collection");
    }
}