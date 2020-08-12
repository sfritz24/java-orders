package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Customer;
import com.lambdaschool.day1project.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerservice")
public class CustomerServiceImp implements CustomerService
{
    @Autowired
    CustomerRepository custrepos;

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        return custrepos.save(customer);
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        List<Customer> list = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
