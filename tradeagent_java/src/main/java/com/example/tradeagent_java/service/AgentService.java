package com.example.tradeagent_java.service;


import com.example.tradeagent_java.model.Agent;
import com.example.tradeagent_java.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AgentService  {

    private final AgentRepository agentRepository;

    @Autowired
    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Transactional
    public void addAgent(Agent agent) {
        agentRepository.save(agent);
    }


}
