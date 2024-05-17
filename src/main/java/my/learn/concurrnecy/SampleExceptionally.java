package my.learn.concurrnecy;

import java.util.concurrent.CompletableFuture;

public class SampleExceptionally {
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
        process(future);
        //future.complete(2);
        future.completeExceptionally(new RuntimeException("Something went wrong"));
    }
}

