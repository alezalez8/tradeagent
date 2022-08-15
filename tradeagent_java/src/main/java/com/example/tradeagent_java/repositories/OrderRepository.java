package com.example.tradeagent_java.repositories;

import com.example.tradeagent_java.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Double> {

}
