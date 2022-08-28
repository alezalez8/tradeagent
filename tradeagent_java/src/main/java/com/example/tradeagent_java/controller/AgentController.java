package com.example.tradeagent_java.controller;


import com.example.tradeagent_java.model.Agent;
import com.example.tradeagent_java.service.AgentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {

    private AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping("/{id}")
    public String getAgent( @PathVariable(value = "id") Long id) throws JsonProcessingException {
        Agent agent = agentService.getAgentId(id);

        System.out.println(agent);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(agent);
    }

    @GetMapping("/all")
    public String getAll() throws JsonProcessingException {
        List<Agent> agentList = agentService.getAllAgents();
        ObjectMapper mapper = new ObjectMapper();
       return mapper.writeValueAsString(agentList);

    }





}
