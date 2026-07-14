package com.example.entity;

import java.time.LocalDateTime;

public class Transaction {
	
	private String type;
	private double amount;
	private String details;
	private LocalDateTime time;
	
	public Transaction(String type, double amount, String details) {
		super();
		this.type = type;
		this.amount = amount;
		this.details = details;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + ", details=" + details + ", time=" + time + "]";
	}
	
	
	
	

}
