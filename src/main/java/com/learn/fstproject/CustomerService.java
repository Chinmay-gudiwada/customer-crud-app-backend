package com.learn.fstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;
    public List<Customer> getData() {
        return repo.findAll();
    }

    public String addCustomer(Customer customer) {
       repo.save(customer);
       return "Customer added successfully..";
    }

    public String deleteCustomer(Integer id){
          repo.deleteById(id);
          return "Customer deleted...";
    }

    public String updateCustomer(Customer customer) {
         repo.save(customer);
         return "Customer updated successfully..";
    }
}
