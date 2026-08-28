package JVM.Garbage_collection;
class Question2 {
    public static void main(String[] args) {

        Question2 obj = new Question2();

        obj = null;   // Object becomes eligible for garbage collection

        System.gc();  // Request JVM to run garbage collection

        System.out.println("Garbage collection requested");
    }
}