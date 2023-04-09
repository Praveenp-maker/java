package com.example.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sample.entity.Order;

@Service
public interface OrderService {
    public List<Order> getAllOrders();
    
    public Order getOrderById(int id);

//    ModelAndView orderentry(Order order);

//    List<Order> cusone(String username);

//    List<Order> getUserDate();

	public void saveOrUpdate(Order order);

	public void delete(int id);

    
}
