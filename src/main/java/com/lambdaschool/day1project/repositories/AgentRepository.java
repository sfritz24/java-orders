package com.lambdaschool.day1project.repositories;

import com.lambdaschool.day1project.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long>
{
}
