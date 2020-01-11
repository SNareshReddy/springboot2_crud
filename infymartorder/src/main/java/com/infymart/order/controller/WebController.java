package com.infymart.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infymart.order.Repository.OrderRepository;
import com.infymart.order.entity.Order;

@Controller
public class WebController {

	@Autowired
	OrderRepository orderRepository;

	@GetMapping("/orderdetails")
	public ModelAndView getAllOrders() {

		ModelAndView mav = new ModelAndView("listorder");
		mav.addObject("list", orderRepository.findAll());
		return mav;
	}

	@GetMapping("/showOrderForm")
	public ModelAndView displaySaveOrderForm() {
		ModelAndView mv = new ModelAndView("saveorderForm");
		mv.addObject("orderdetails", new Order());
		return mv;
	}

	@PostMapping("/saveorder")
	public ModelAndView createOrder(@ModelAttribute("orderdetails") Order order) {
		orderRepository.save(order);
		ModelAndView mv = new ModelAndView("listorder");
		mv.addObject("list", orderRepository.findAll());
		return mv;
	}
	
	
	@GetMapping("/order/{id}")
	public ModelAndView updateOrderDetails(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("saveorderForm");
		Order order = orderRepository.findById(id).get();
		if(order == null) {
			throw new RuntimeException("Order details not found for "+id);
		}
		mav.addObject("orderdetails", order);
		return mav;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteOrder(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("listorder");
		Order order = orderRepository.findById(id).get();
		orderRepository.delete(order);
		mav.addObject("list", orderRepository.findAll());
		return mav;
	}
}
