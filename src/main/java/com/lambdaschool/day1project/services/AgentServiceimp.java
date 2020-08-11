package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Agent;
import com.lambdaschool.day1project.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServiceimp implements AgentService
{
    @Autowired
    AgentRepository agentrepos;

    @Override
    public Agent save(Agent agent)
    {
        return agentrepos.save(agent);
    }
}
