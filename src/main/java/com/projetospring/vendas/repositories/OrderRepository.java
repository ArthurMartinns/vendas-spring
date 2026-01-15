package com.projetospring.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetospring.vendas.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
