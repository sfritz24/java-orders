package com.lambdaschool.day1project.controllers;

import com.lambdaschool.day1project.models.Customer;
import com.lambdaschool.day1project.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired
    private CustomerService customerservice;

    // http://localhost:2019/customers/orders

    // http://localhost:2019/customers/customer/7
    // http://localhost:2019/customers/customer/77

    // http://localhost:2019/customers/namelike/mes
    // http://localhost:2019/customers/namelike/cin

    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customer> customerList = customerservice.findAllCustomers();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{custid}", produces = "application/json")
    public ResponseEntity<?> listCustById(@PathVariable long custid)
    {
        Customer oneCustomer = customerservice.findById(custid);
        return new ResponseEntity<>(oneCustomer, HttpStatus.OK);
    }

    @GetMapping(value = "/namelike/{likename}", produces = "application/json")
    public ResponseEntity<?> listCustByLikeName(@PathVariable String likename)
    {
        List<Customer> custLikeName = customerservice.findByLikeName(likename);
        return new ResponseEntity<>(custLikeName, HttpStatus.OK);
    }
}
