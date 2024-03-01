package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    public List<Customer> getbill()
    {
        return customerRepo.findAll();
    }
    public Customer savebill(Customer customer){
        return customerRepo.save(customer);
    }

    public Optional<Customer> findbill(int customerId){
        return customerRepo.findById(customerId);
    }

    public List<Customer> getSort(){
        Sort sort = Sort.by(Sort.Direction.ASC,"customerBill");
        return customerRepo.findAll(sort);
    }
    public List<Customer> getpaged(int no,int sz){
        Pageable page = PageRequest.of(no, sz);
        return customerRepo.findAll(page).getContent();
    }

}
