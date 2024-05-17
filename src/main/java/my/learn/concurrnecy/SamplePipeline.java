package my.learn.concurrnecy;

import java.util.concurrent.CompletableFuture;

public class SamplePipeline {
    public static void process(CompletableFuture<Integer> future){
        future.thenApply(data -> data * 2)
                .thenApply(data -> data + 1)
                .thenAccept(System.out::println);
    }

    public static void main(String[] args) {
        CompletableFuture<Integer> future = new CompletableFuture<>();
        process(future);
        future.complete(2);
    }
}
