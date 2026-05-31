package com.learn.fstproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins={"https://customer-crud-app.vercel.app/","http://localhost:5173/"})
@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/customers")
    public List<Customer> getData(){
        return service.getData();
    }


    @PostMapping("/customers")
    public String addCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }
    @PutMapping("/customers/update")
    public String updateCustomer(@RequestBody Customer customer){

        return service.updateCustomer(customer);
    }
    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable Integer id){
        return service.deleteCustomer(id);
    }


}
