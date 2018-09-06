package com.yourname.Controller;

import com.yourname.Domain.Customer;
import com.yourname.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @Autowired
    CustomerRepo rp;

    @RequestMapping("/findall")
    @ResponseBody
    public List<Customer> findall(){
        return rp.findAll();
    }



}
