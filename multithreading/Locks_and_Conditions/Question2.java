package multithreading.Locks_and_Conditions;
import java.util.concurrent.locks.*;

class Test {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    void waitThread() throws Exception {
        lock.lock();
        try {
            System.out.println("Waiting...");
            condition.await();
            System.out.println("Thread resumed");
        } finally {
            lock.unlock();
        }
    }

    void signalThread() {
        lock.lock();
        try {
            System.out.println("Signaling...");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        Test t = new Test();

        new Thread(() -> {
            try {
                t.waitThread();
            } catch (Exception e) {}
        }).start();

        new Thread(() -> t.signalThread()).start();
    }
}