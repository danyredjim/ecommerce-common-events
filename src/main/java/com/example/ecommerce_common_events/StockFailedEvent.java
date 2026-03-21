package com.example.ecommerce_common_events;

import java.time.Instant;

public class StockFailedEvent {

    private Long orderId;
    
    private String string;
    
    private Instant instant;

    public StockFailedEvent() {}

    public StockFailedEvent(String string, Long orderId, Instant instant) {
        this.orderId = orderId;
    }

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}


}
