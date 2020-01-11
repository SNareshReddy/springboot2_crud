package com.infymart.order.controller;

import com.infymart.order.entity.Order;

import com.infymart.order.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	OrderRepository orderRepository;

	@GetMapping("/orderdetails")
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@PostMapping("/saveorder")
	public ResponseEntity<Object> createOrder(@Valid @RequestBody Order order) {
		Order savedorder = orderRepository.save(order);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/orderdetails/{order_id}")
	public Order getOrderById(@PathVariable int order_id) {
		Order order = orderRepository.findById(order_id).get();
		return order;
		// return orderRepository.findById(order_id);

	}

	@DeleteMapping("/orderdetails/{order_id}")
	public ResponseEntity<Object> getDeleteById(@PathVariable int order_id) {
		Order order = orderRepository.findById(order_id).get();
		orderRepository.delete(order);
		// return orderRepository.findById(order_id);
		return ResponseEntity.ok().build();
	}

}
