package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Order;

import java.util.List;

public interface OrderService
{
    List<Order> findAllOrders();

    Order findById(long id);

    Order save(Order order);
}
