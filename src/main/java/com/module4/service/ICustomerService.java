package com.module4.service;

import com.module4.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer findById(long id);
}
