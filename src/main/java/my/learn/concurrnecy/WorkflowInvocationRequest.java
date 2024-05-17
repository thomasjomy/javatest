package my.learn.concurrnecy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class WorkflowInvocationRequest {
    private String requestId;
    private String workflowName;
}
