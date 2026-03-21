package com.example.ecommerce_common_events;

import java.time.Instant;
import java.util.UUID;

public class OrderCreatedEvent {

	private String eventId;// 🔥 1️⃣ Idempotencia evita que dos consumidores reserven al mismo tiempo y rompan stock.
    private Long orderId;
    private Long productId;
    private int quantity;
    private double clientLat;
    private double clientLon;
    private Instant occurredAt;//importante
    
    
    
	public OrderCreatedEvent() {}
	
	public OrderCreatedEvent(Long orderId, Long productId, int quantity, double clientLat, double clientLon) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.clientLat = clientLat;
		this.clientLon = clientLon;
        this.eventId = UUID.randomUUID().toString();   // 🔥 id único
        this.occurredAt = Instant.now();               // 🔥 marca de tiempo
	}//
	
	
	// getters & setters
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getClientLat() {
		return clientLat;
	}
	public void setClientLat(double clientLat) {
		this.clientLat = clientLat;
	}
	public double getClientLon() {
		return clientLon;
	}
	public void setClientLon(double clientLon) {
		this.clientLon = clientLon;
	}
	public Instant getOccurredAt() {
		return occurredAt;
	}
	public void setOccurredAt(Instant occurredAt) {
		this.occurredAt = occurredAt;
	}
   
    
}
