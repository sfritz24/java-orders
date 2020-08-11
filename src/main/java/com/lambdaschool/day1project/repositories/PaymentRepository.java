package com.lambdaschool.day1project.repositories;

import com.lambdaschool.day1project.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long>
{
}
