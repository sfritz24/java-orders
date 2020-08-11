package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public interface AgentServiceimp implements AgentService
{
    @Autowired
    AgentRepository agentrepos;
}
