package com.example.sample.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.sample.entity.Order;
import com.example.sample.repository.OrderRepository;
import com.example.sample.service.OrderService;

import jakarta.transaction.Transactional;

public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;

	@Override
	@Transactional
	public List<Order> getAllOrders() {
		return orderRepository.findAll();

	}

	@Override
	@Transactional
	public Order getOrderById(int id) {
		return orderRepository.findById(id).get();

	}

	@Override
	@Transactional
	public void saveOrUpdate(Order order) {
		orderRepository.save(order);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		orderRepository.deleteById(id);
	}

}
