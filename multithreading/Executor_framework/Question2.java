package multithreading.Executor_framework;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question2 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 4; i++) {
            int task = i;

            executor.execute(() -> {
                System.out.println("Task " + task +
                        " running by " +
                        Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}