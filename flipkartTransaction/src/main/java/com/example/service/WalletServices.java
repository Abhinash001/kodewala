package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Transaction;
import com.example.entity.User;
import com.example.repo.WalletRepo;

@Service
public class WalletServices {
	@Autowired
	private WalletRepo repo;
	
	
	public void createWallet(String name,double amount) {
		if(amount<0) {
			System.out.println("Amount cannot be negative");
			return ;
		}
		repo.save(new User(name, amount));
		System.out.println("wallet opened"+name+" with amount"+amount);
	}
	public void topUp(String name,double amount) {
		User user=repo.findByName(name);
		if(user==null) {
			System.out.println("user not found");
			return;
		}
		
		user.setBalance(user.getBalance()+amount);
		user.getTransactions().add(new Transaction(name, amount, "added"));
		System.out.println("money added");
	}
	
	public void tansfer(String from,String to,double amount) {
		User sender=repo.findByName(from);
		User receive=repo.findByName(to);
		
		if(sender==null || receive== null) {
			System.out.println("User not found");
			return ;
		}
		if(sender.getBalance()<amount) {
			System.out.println("low balance");
		}
		sender.setBalance(sender.getBalance()-amount);
		receive.setBalance(receive.getBalance()+amount);
		
		sender.getTransactions().add(new Transaction("debited", amount, "Transfer to"+to));
		receive.getTransactions().add(new Transaction("credit", amount, "from-"+from));
	}
	
	public void statement(String name) {
		User user=repo.findByName(name);
		
		if(user==null) {
			System.out.println("user not foune");
			return;
		}
		for(Transaction t:user.getTransactions()) {
			System.out.println(t);
		}
	}
	
	public double systemBalance() {
		return repo.findByAll().stream().mapToDouble(u->u.getBalance()).sum();
	}

}




