package com.example.tradeagent_java.repositories;

import com.example.tradeagent_java.model.Agent;
import com.example.tradeagent_java.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long > {
}
