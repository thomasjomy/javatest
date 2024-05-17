package my.learn.concurrnecy.orderflow;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class OrderFlowAsync {

    public static void main(String[] args) {
        OrderFlowAsync orderFlowAsync = new OrderFlowAsync();

        CompletableFuture.supplyAsync(() -> orderFlowAsync.fetchOrder())
                .thenApply(order -> orderFlowAsync.enrichOrder(order))
                .thenApply(order -> orderFlowAsync.pay(order))
                .thenApply(order -> orderFlowAsync.dispatch(order))
                .thenAccept(order -> orderFlowAsync.sendConfirmationEmail(order))
                .thenRun(() -> System.out.println("Done!"));
    }

    private void sendConfirmationEmail(Order order){
        System.out.println("sendConfirmationEmail : " + Thread.currentThread());
    }

    private Order dispatch(Order order){
        System.out.println("dispatch : " + Thread.currentThread());
        return order;
    }

    private Order pay(Order order){
        System.out.println("pay : " + Thread.currentThread());
        return order;
    }

    private Order enrichOrder(Order order){
        System.out.println("enrichOrder : " + Thread.currentThread());
        return order;
    }

    private Order fetchOrder(){
        System.out.println("fetchOrder : " + Thread.currentThread());
        Order order = new Order();
        order.setId(UUID.randomUUID().toString());
        order.setUser("Jomy");
        order.setCreateTime(LocalDateTime.now());
        return order;
    }
}
