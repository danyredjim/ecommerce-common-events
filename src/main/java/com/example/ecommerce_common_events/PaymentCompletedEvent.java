package com.example.ecommerce_common_events;

import java.time.Instant;

public class PaymentCompletedEvent {

    private String eventId;
    private Long orderId;
    private Instant occurredAt;

    public PaymentCompletedEvent() {
    }

    public PaymentCompletedEvent(String eventId,
                                 Long orderId,
                                 Instant occurredAt) {
        this.eventId = eventId;
        this.orderId = orderId;
        this.occurredAt = occurredAt;
    }

    public String getEventId() {
        return eventId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Instant getOccurredAt() {
        return occurredAt;
    }
}
