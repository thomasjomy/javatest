package my.learn.concurrnecy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class EmailClient {
    private static final Logger logger = LoggerFactory.getLogger(EmailClient.class);

    public void sendMail(EmailData emailData){
        logger.info("Sending mail - {}", emailData);
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
