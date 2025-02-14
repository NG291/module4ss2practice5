package com.module4.controller;

import com.module4.model.Customer;
import com.module4.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
    @RequestMapping("/customers")
    public class CustomerService {
        @Autowired
        private ICustomerService customerService;

        @GetMapping()
        public ModelAndView showList() {
            ModelAndView modelAndView = new ModelAndView("list");
            List<Customer> customers = customerService.getCustomers();
            modelAndView.addObject("customers", customers);
            return modelAndView;
        }

}
