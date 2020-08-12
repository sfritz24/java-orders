package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Agent;

import java.util.List;

public interface AgentService
{
    List<Agent> findAllAgents();

    Agent findById(long id);

    Agent save(Agent agent);
}
