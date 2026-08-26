package multithreading.Locks_and_Conditions;

    import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    int count = 0;
    Lock lock = new ReentrantLock();

    void increment() {
        lock.lock();
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + ": " + count);
        } finally {
            lock.unlock();
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> c.increment());
        Thread t2 = new Thread(() -> c.increment());

        t1.start();
        t2.start();
    }
}
