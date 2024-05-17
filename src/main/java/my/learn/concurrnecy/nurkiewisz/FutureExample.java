package my.learn.concurrnecy.nurkiewisz;

import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) {
        StackOverflowClient client = new StackOverflowClient();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        final Callable<String> task = () -> client.mostRecentQuestionAbout("Java");
        Future<String> javaQuestionFuture = executorService.submit(task);
        String javaQuestion = null;
        try {
            javaQuestion = javaQuestionFuture.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(javaQuestion);
    }
    
}
