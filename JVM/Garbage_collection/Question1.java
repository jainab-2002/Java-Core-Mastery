package JVM.Garbage_collection;
class Question1 {
    public void show() {
        System.out.println("Object is alive");
    }

    public static void main(String[] args) {
        Question1 q = new Question1();
        q.show();
        q = null;
        System.gc();
        System.out.println("Program finished");
    }
}