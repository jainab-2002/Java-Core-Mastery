package multithreading.Executor_framework;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question1 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> {
            System.out.println("Task is running");
        });

        executor.shutdown();
    }
}