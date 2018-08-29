package com.hjx.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

import com.hjx.demo.model.Customer;


@Mapper
public interface CustomerMapper {

    public void insert(Customer customer);

    public void update(Customer customer);

    public void delete(String id);

    public Customer find(String id);

    public List<Customer> findAll();

}
