package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Order;
import com.lambdaschool.day1project.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "orderservice")
public class OrderServiceImp implements OrderService
{
    @Autowired
    OrderRepository orderrepos;

    @Transactional
    @Override
    public Order save(Order order)
    {
        return orderrepos.save(order);
    }

    @Override
    public List<Order> findAllOrders()
    {
        List<Order> list = new ArrayList<>();
        orderrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Order findById(long id)
    {
        return orderrepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Order " + id + " Not Found!"));
    }
}
