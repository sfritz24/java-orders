package com.lambdaschool.day1project.repositories;

import com.lambdaschool.day1project.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
