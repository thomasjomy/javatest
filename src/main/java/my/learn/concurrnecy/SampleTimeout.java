package my.learn.concurrnecy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class SampleTimeout {
    public static void process(CompletableFuture<Integer> future){
        future.exceptionally(throwable -> handleException(throwable))
                .thenApply(data -> data * 2)
                .thenApply(data -> data + 1)
                .thenAccept(System.out::println);
    }

    public static int handleException(Throwable throwable){
        System.out.println("Error :: "+ throwable);
        return 100;
    }

    public static void main(String[] args) {
        CompletableFuture<Integer> future = new CompletableFuture<>();
        //future.completeOnTimeout(500, 3, TimeUnit.SECONDS);
        future.orTimeout(3, TimeUnit.SECONDS);
        process(future);
        sleep(2000);

        sleep(5000);
        future.complete(2);
        //future.completeExceptionally(new RuntimeException("Something went wrong"));
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
