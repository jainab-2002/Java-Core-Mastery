package multithreading.Concurrent_collections;
import java.util.concurrent.ConcurrentHashMap;

class Question1 {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map =
                new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            map.put(1, "Apple");
            map.put(2, "Banana");
            System.out.println("Thread 1 added data");
        });

        Thread t2 = new Thread(() -> {
            map.put(3, "Mango");
            map.put(4, "Orange");
            System.out.println("Thread 2 added data");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Map: " + map);
    }
}