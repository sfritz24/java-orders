package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAllCustomers();

    Customer findById(long id);

    List<Customer> findByLikeName(String likename);

    Customer save(Customer customer);
}
