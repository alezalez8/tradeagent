package com.example.tradeagent_java.service;


import com.example.tradeagent_java.model.Agent;
import com.example.tradeagent_java.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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


    @Transactional(readOnly = true)
    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }


    @Transactional(readOnly = true)
    public Agent getAgentById(Long id) {
        System.err.println(agentRepository.findById(id).get());
        return agentRepository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public Agent getAgentId(Long id) {
        return agentRepository.finById(id);
    }


}
