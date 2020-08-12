package com.lambdaschool.day1project.controllers;

import com.lambdaschool.day1project.models.Agent;
import com.lambdaschool.day1project.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController
{
    @Autowired
    private AgentService agentservice;

    // http://localhost:2019/agents/agents
    
    // http://localhost:2019/agents/agent/9
    
    @GetMapping(value = "/agents", produces = "application/json")
    public ResponseEntity<?> listAllAgents()
    {
        List<Agent> agentList = agentservice.findAllAgents();
        return new ResponseEntity<>(agentList, HttpStatus.OK);
    }

    @GetMapping(value = "/agent/{agentid}", produces = "application/json")
    public ResponseEntity<?> listAgentById(@PathVariable long agentid)
    {
        Agent oneAgent = agentservice.findById(agentid);
        return new ResponseEntity<>(oneAgent, HttpStatus.OK);
    }
}
