package my.learn.concurrnecy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.Instant;
import java.util.UUID;

public class ServiceOrchestrator {
    private static final Logger logger = LoggerFactory.getLogger(EmailClient.class);

    public static void main(String[] args) {
        Instant start = Instant.now();
        invokeServices();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Elapsed time for service invocation - {}", timeElapsed);
    }

    private static void invokeServices() {
        invokeWorkflow();
        sendMail();
    }

    private static void invokeWorkflow(){
        WorkflowInvocationRequest workflowRequest = WorkflowInvocationRequest.builder()
                .requestId(UUID.randomUUID().toString())
                .workflowName("Test Workflow")
                .build();

        WorkflowServiceClient workflowServiceClient = new WorkflowServiceClient();
        WorkflowInvocationResponse response = workflowServiceClient.invoke(workflowRequest);
    }

    private static void sendMail(){
        EmailData emailData = EmailData.builder()
                .sender(new Sender("jthoma@gmail.com"))
                .recipient(new Recipient("testmail@gmai.com"))
                .build();

        EmailClient emailClient = new EmailClient();
        emailClient.sendMail(emailData);
    }
}
