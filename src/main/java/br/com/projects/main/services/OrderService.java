package br.com.projects.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projects.main.entities.Order;
import br.com.projects.main.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findById(Integer id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}

}
