package com.Edu25664.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Edu25664.vendas.DTO.OrderDTO;
import com.Edu25664.vendas.service.OrderService;

@RestController 
@RequestMapping(value ="/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	private ResponseEntity<List<OrderDTO>> findAll(){
		List<OrderDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
