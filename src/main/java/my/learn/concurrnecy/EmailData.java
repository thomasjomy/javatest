package my.learn.concurrnecy;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class EmailData {
    private Sender sender;
    private Recipient recipient;
    private String subject;
    private String body;
}
