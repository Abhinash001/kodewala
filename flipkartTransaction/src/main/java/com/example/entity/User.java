package com.example.entity;

import java.util.ArrayList;
import java.util.List;


public class User {
	private String name;
	private double balance;
	private List<Transaction>transactions=new ArrayList<>();
	
	public User(String name,double amount) {
		this.name=name;
		this.balance=balance;
		
		transactions.add(new Transaction("deposite", amount, "intial"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	

}
