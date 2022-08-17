package com.Edu25664.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Edu25664.vendas.DTO.OrderDTO;
import com.Edu25664.vendas.entities.Order;
import com.Edu25664.vendas.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
     
	@Transactional
	public List<OrderDTO> findAll(){
	  List<Order> list = repository.findAll();
	  return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}

