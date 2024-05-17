package my.learn.concurrnecy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class WorkflowServiceClient {
    private static final Logger logger = LoggerFactory.getLogger(WorkflowServiceClient.class);

    public WorkflowInvocationResponse invoke(WorkflowInvocationRequest request){
        logger.info("invoke workflow - {}", request);

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return WorkflowInvocationResponse.builder()
                .requestId(request.getRequestId())
                .status("SUCCESS")
                .build();
    }
}
