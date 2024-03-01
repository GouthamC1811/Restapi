package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @PostMapping("/addbill")
    public Customer addbill(@RequestBody Customer customer) {      
        return customerService.savebill(customer);
    }

    @GetMapping("/getbill")
    public List<Customer> gettbill() {
        return customerService.getbill();
    }

    @GetMapping("/savebill/{customerId}")
    public Optional<Customer> findbil(@PathVariable int customerId) {
        return customerService.findbill(customerId);
    }
    
    @GetMapping("/getbill/sort")
    public List<Customer> getsorted() {
        return customerService.getSort();
    }
    
    @GetMapping("/getpaged/{no}/{sz}")
    public List<Customer> getMethodName(@PathVariable int no,@PathVariable int sz) {
        return customerService.getpaged(no,sz);
    }
    
}
