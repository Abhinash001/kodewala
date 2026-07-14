package com.example.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public class WalletRepo {
	private Map<String, User>users=new HashMap<>();
	
	public void save(User user) {
		users.put(user.getName(), user);
	}
	
	public User findByName(String name) {
		return users.get(name);
	}
	public List<User>findByAll(){
		return new ArrayList<>(users.values());
	}

}
