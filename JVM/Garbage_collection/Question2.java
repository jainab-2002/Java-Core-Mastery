package JVM.Garbage_collection;
class Question2 {
    public static void main(String[] args) {

        Question2 obj = new Question2();
        System.out.println("Object created: " + obj); 

        obj = null;  
        System.gc();

        System.out.println("Garbage collection requested");
    }
}