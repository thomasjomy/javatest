package my.learn.concurrnecy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class SampleCustomPool {
    private static ForkJoinPool fjp = new ForkJoinPool(10);

    public static void main(String[] args) {
        System.out.println("main : "+ Thread.currentThread());
        create().thenAccept(data -> System.out.println(data));
    }

    public static CompletableFuture<Integer> create(){
        return CompletableFuture.supplyAsync( () -> compute() , fjp);
    }
    public static int compute(){
        System.out.println("compute : " + Thread.currentThread());
        return 2;
    }
}
