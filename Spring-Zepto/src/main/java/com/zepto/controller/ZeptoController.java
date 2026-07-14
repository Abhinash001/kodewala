package com.zepto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.entity.Users;

@RestController
public class ZeptoController {
	//
	@GetMapping("/showOrderPage")
	public String sayHello()
	{
		System.out.println("Hello Abinash");
		return "hello";
	}
	
	@PostMapping("/submitForm")
	public String handleForm(@ModelAttribute Users user) {

	    System.out.println(user.getName());
	    System.out.println(user.getEmail());

	    return "success";
	}

}
