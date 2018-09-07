package com.yourname.Controller;

import com.yourname.Domain.Customer;
import com.yourname.Repository.CustomerRepo;
import com.yourname.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    CustomerService Service;

    @RequestMapping(value = " ", method = RequestMethod.GET)
    public List<Customer> getall()
    {
        return Service.getCustomer();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable("id") int id)
    {
        return Service.findById(id);
    }


    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id)
    {
        Service.deleteUserById(id);
    }



    @RequestMapping(value="/update/", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentById(@RequestBody Customer user)
    {
        Service.update(user);
    }

    @RequestMapping(value="/insert", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insert(@RequestBody Customer user)
    {
        Service.add(user);
    }








}
