package com.lambdaschool.day1project.repositories;

import com.lambdaschool.day1project.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
