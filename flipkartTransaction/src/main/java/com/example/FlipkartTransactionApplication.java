package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.WalletServices;

@SpringBootApplication
public class FlipkartTransactionApplication implements CommandLineRunner {
	
	@Autowired
	private WalletServices service;

	public static void main(String[] args) {
		SpringApplication.run(FlipkartTransactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.createWallet("Alice", 100);
        service.createWallet("Bob", 20);
        service.topUp("Alice", 50);
        service.tansfer("Alice", "Bob", 30);
        
        service.statement("Alice");
        System.out.println("--- System Overview ---");
	}
	
	
	

}
