package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
	}

