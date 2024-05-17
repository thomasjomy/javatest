package my.learn.concurrnecy;

import java.util.concurrent.CompletableFuture;

public class SampleThenRun {
    public static void main(String[] args) {
        System.out.println("main : " + Thread.currentThread());
        create()
                .thenAccept(data -> System.out.println(data))
                .thenRun(() -> System.out.println("Done!"));
    }

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> compute());
    }

    public static int compute() {
        System.out.println("compute : " + Thread.currentThread());
        return 2;
    }
}
