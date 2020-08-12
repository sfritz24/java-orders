package com.lambdaschool.day1project.controllers;

import com.lambdaschool.day1project.models.Order;
import com.lambdaschool.day1project.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController
{
    @Autowired
    private OrderService orderservice;

    // http://localhost:2019/orders/orders

    // http://localhost:2019/orders/order/7

    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> listAllOrders()
    {
        List<Order> orderList = orderservice.findAllOrders();
        return new ResponseEntity<>(orderList, HttpStatus.OK);
    }

    @GetMapping(value = "/order/{orderid}", produces = "application/json")
    public ResponseEntity<?> listOrderById(@PathVariable long orderid)
    {
        Order oneOrder = orderservice.findById(orderid);
        return new ResponseEntity<>(oneOrder, HttpStatus.OK);
    }
}
