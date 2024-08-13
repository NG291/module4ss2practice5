package com.module4.service;

import com.module4.model.Customer;
import org.springframework.beans.CachedIntrospectionResults;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerDAO implements ICustomerService {
    private static List<Customer> customers;

    static {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "John", "john@gmail.com", "My"));
        customers.add(new Customer(2, "Han", "Han@gmail.com", "VietNam"));
        customers.add(new Customer(3, "Minh", "Minh@gmail.com", "HaNoi"));
        customers.add(new Customer(4, "Lam", "Lam@gmail.com", "NamDing"));
        customers.add(new Customer(5, "Son", "Son@gmail.com", "ThaiBinh"));

    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public Customer findById(long id) {
        return null;
    }

}
