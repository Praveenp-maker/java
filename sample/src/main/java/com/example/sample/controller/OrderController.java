package com.example.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.entity.Order;
import com.example.sample.service.OrderService;

@CrossOrigin
@RestController
@RequestMapping("/orders/test")
public class OrderController {

	@Autowired(required = false)
	private OrderService orderService;

	@GetMapping(value = "/fullorder", headers = "Accept=application/json")
	public ResponseEntity<?> orderentry() {

		List<Order> sen = orderService.getAllOrders();

		System.out.println(sen);
		return new ResponseEntity<>(sen, HttpStatus.OK);

	}
	
	@GetMapping("/order/{id}")  
	public ResponseEntity<Order> getOrder(@PathVariable("id") int id)   
	{  
		Order order = orderService.getOrderById(id);
	return  new ResponseEntity<>(order, HttpStatus.OK); 
	} 
	
	@PostMapping("/createorder")  
	private int saveBook(@RequestBody Order order)   
	{  
	orderService.saveOrUpdate(order);  
	return order.getId();  
	}
	
	@DeleteMapping("/order/{id}")  
	private void deleteBook(@PathVariable("id") int id)   
	{  
	orderService.delete(id);  
	}  

	@PutMapping("/orders1")  
	private Order update(@RequestBody Order order)   
	{  
	orderService.saveOrUpdate(order);  
	return order;  
	} 
}
