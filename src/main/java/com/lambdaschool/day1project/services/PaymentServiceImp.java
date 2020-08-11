package com.lambdaschool.day1project.services;

import com.lambdaschool.day1project.models.Payment;
import com.lambdaschool.day1project.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "paymentservice")
public class PaymentServiceImp implements PaymentService
{
    @Autowired
    PaymentRepository payrepos;

    @Override
    public Payment save(Payment payment)
    {
        return payrepos.save(payment);
    }
}
