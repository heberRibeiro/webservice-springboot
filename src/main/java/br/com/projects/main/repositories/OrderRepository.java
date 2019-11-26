package br.com.projects.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projects.main.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
