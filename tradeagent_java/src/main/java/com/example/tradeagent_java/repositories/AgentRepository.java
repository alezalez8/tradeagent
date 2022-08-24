package com.example.tradeagent_java.repositories;

import com.example.tradeagent_java.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long > {
}
