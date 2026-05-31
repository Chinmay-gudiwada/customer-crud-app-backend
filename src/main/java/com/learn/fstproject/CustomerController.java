package com.learn.fstproject;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
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
    @PutMapping("/customers/{id}")
    public String updateCustomer(@PathVariable Integer id,@RequestBody Customer customer){
        customer.setId(id);
        return service.updateCustomer(customer);
    }
    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable Integer id){
        return service.deleteCustomer(id);
    }


}
