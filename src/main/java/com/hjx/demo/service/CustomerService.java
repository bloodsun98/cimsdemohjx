package com.hjx.demo.service;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hjx.demo.mapper.CustomerMapper;
import com.hjx.demo.model.Customer;

@ComponentScan({"com.hjx.demo.mapper"})
@Service//("CustomerService")
public class CustomerService {

//    @Resource
    @Autowired
    private CustomerMapper customerMapper;


    public void insert(Customer customer)
    {
        customerMapper.insert(customer);
    }

    public void update(Customer customer) {
        customerMapper.update(customer);
    }

    public Customer find(String id) {
        System.out.print(id+"++++++++++++");
        return customerMapper.find(id);
    }

    public void delete(String id){
        customerMapper.delete(id);
    }
    public List<Customer> findAll(){

       return customerMapper.findAll();
    }
}
