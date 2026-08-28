package JVM.Garbage_collection;
class Question1 {
    public static void main(String[] args) {

        Question1 obj = new Question1();

        obj = null;  // Object is now eligible for garbage collection

        System.gc(); // Request garbage collection

        System.out.println("Program finished");
    }
}