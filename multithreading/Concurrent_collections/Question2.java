package multithreading.Concurrent_collections;
import java.util.concurrent.CopyOnWriteArrayList;

class Question2 {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list =
                new CopyOnWriteArrayList<>();

        Thread t1 = new Thread(() -> {
            list.add("Java");
            list.add("Python");
            System.out.println("Thread 1 added elements");
        });

        Thread t2 = new Thread(() -> {
            list.add("C++");
            list.add("JavaScript");
            System.out.println("Thread 2 added elements");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final List: " + list);
    }
}