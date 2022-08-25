package com.example.tradeagent_java.repositories;

import com.example.tradeagent_java.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long > {

    @Query("SELECT a FROM Agent a WHERE a.id = :id")
    Agent finById(@Param("id") Long id);

}
