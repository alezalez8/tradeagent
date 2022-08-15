package com.example.tradeagent_java.model;


import javax.persistence.*;

@Entity
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agent_id")
    private long agentId;
}
