package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Customer;
import com.lambdaschool.day1project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerservice")
public class CustomerServiceImp implements CustomerService
{
    @Autowired
    CustomerRepository custrepos;

    @Override
    public Customer save(Customer customer)
    {
        return custrepos.save(customer);
    }
}
