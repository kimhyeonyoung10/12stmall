package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private String userId;
    private Long id;
    private Long orderId;
    private String productName;
    private Integer qty;
    private Long productId;
    private Boolean status;
    private String courier;
}
