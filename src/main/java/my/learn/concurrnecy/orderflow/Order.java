package my.learn.concurrnecy.orderflow;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Order {
    private String id;
    private String user;
    private LocalDateTime createTime;

}
