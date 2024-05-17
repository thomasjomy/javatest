package my.learn.concurrnecy;

import java.util.concurrent.CompletableFuture;

public class Sample {
    public static void main(String[] args) {
        System.out.println("main : "+ Thread.currentThread());
        create().thenAccept(data -> System.out.println(data));
    }

    public static CompletableFuture<Integer> create(){
        return CompletableFuture.supplyAsync( () -> compute());
    }
    public static int compute(){
        System.out.println("compute : " + Thread.currentThread());
        return 2;
    }
}
