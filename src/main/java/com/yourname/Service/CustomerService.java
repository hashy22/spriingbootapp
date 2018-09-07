package com.yourname.Service;

import com.yourname.Domain.Customer;
import com.yourname.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;

    public void createUser(Customer user) {
        repo.save(user);
    }


    public List<Customer> getCustomer() {

        return (List<Customer>) repo.findAll();
    }


    public Customer findById(int id) {
        return repo.findOne(id);
    }


    public Customer add(Customer user) {
        return repo.save(user);
    }


    public void deleteUserById(int id) {
        repo.delete(id);
    }

    public Customer update(Customer user) {
        Customer u = findById(user.getId());
        u.setPhone(user.getPhone());
        u.setName(user.getName());
        u.setId(user.getId());
        return repo.save(u);
    }

}
