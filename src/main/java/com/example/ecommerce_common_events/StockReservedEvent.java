package com.example.ecommerce_common_events;

import java.time.Instant;

public class StockReservedEvent {

	private String eventId;
	private String uuid;
    private Long orderId;
    private Long productId;
    private Integer quantity;
    private Instant instant;    

    public StockReservedEvent() {}

	public StockReservedEvent(String uuid, Long orderId, Long productId, Integer quantity, Instant instant) {
		super();
		this.uuid = uuid;
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.instant = instant;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}




}
