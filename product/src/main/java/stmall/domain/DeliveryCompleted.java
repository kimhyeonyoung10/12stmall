package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
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
