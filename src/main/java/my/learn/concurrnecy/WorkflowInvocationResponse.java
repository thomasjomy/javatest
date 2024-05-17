package my.learn.concurrnecy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@AllArgsConstructor
@ToString
public class WorkflowInvocationResponse {
    private String requestId;
    private String status;
}
