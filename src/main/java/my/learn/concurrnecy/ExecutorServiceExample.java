package my.learn.concurrnecy;

import java.util.Random;
import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> future = service.submit(new Task());
        try{
            Integer result = future.get();
            System.out.println("result - " + result);
        }catch (InterruptedException | ExecutionException ie ){
            ie.printStackTrace();
        }
    }

    static class Task implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return new Random().nextInt();
        }
    }
}


