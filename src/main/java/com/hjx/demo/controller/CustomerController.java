package com.hjx.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hjx.demo.model.Customer;
import com.hjx.demo.service.CustomerService;

import java.util.HashMap;

@Controller
//@RestController
@ComponentScan({"com.hjx.demo.service"})
@MapperScan("com.hjx.demo.mapper")
public class CustomerController {

    @Resource
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value="/hello")
    public String hello(){
        return "hello world";
    }



    @RequestMapping(value="/find")
    public String find(){
        return "findonecustomer";
    }
    @RequestMapping(value="/findonecustomer")
    //public String findOneCustomer(@ModelAttribute("find") Customer customers) {
    public String findOneCustomer(HttpServletRequest request, @RequestParam("cust_id") String cust_id){

        Customer customer = customerService.find(cust_id);

        System.out.println("username is:"+customer.getCust_id());
        System.out.println("password is:"+customer.getCust_name());
        System.out.println("password is:"+customer.getCust_type());
        System.out.println("username is:"+customer.getCust_no());
        System.out.println("username is:"+customer.getCust_birth());
        System.out.println("username is:"+customer.getCust_home());
        System.out.println("password is:"+customer.getCust_phone());
        System.out.println("password is:"+customer.getCust_email());
        System.out.println("password is:"+customer.getCust_status());

        request.setAttribute("customer", customer);

        return "result";
    }

    @RequestMapping(value="/add")
    public String addCustomer(Customer customer){
        //model.addAttribute("creatcustomer", new Customer());
        return "addcustomer";
    }
    /**
     * 5、使用@ModelAttribute注解获取POST请求的FORM表单数据
     * @param user
     * @return
     */
    @RequestMapping(value="/addcustomer")
    public String addCustomers(@ModelAttribute("add") Customer customer, HttpServletRequest request) {

        System.out.println("username is:"+customer.getCust_id());
        System.out.println("password is:"+customer.getCust_name());
        System.out.println("password is:"+customer.getCust_type());
        System.out.println("username is:"+customer.getCust_no());
        System.out.println("username is:"+customer.getCust_birth());
        System.out.println("username is:"+customer.getCust_home());
        System.out.println("password is:"+customer.getCust_phone());
        System.out.println("password is:"+customer.getCust_email());
        System.out.println("password is:"+customer.getCust_status());
        if (customer.getCust_id().isEmpty()) {
            //return "please input data......!!!";
        }
        customerService.insert(customer);

//        ModelAndView modelView = new ModelAndView();
//        HashMap<String ,Object> map = new HashMap<String, Object>();
//        map.put("cust_id", customer.getCust_id());
//        modelView.addObject("customer", map);
//        modelView.setViewName("result");

        request.setAttribute("customer", customer);
        return "success";
    }

    @RequestMapping(value="/update")
    public String updatedCustomer(){
        //model.addAttribute("creatcustomer", new Customer());
        return "findonecustomer";
    }

    @RequestMapping(value="/updatecustomer")
    public String updateOneCustomer(@ModelAttribute("findonecustomer") Customer customer, HttpServletRequest request) {

        //Customer customers = customerService.find(customer.getCust_id());

        System.out.println("username--------- is:"+customer.getCust_id());
        System.out.println("password is:"+customer.getCust_name());
        System.out.println("password is:"+customer.getCust_type());
        System.out.println("username is:"+customer.getCust_no());
        System.out.println("username is:"+customer.getCust_birth());
        System.out.println("username is:"+customer.getCust_home());
        System.out.println("password is:"+customer.getCust_phone());
        System.out.println("password is:"+customer.getCust_email());
        System.out.println("password is:"+customer.getCust_status());
        if (customer.getCust_id().isEmpty()) {
            //return "please input data......!!!";
        }

        String upd = request.getParameter("update");
        //System.out.println("upd--------- is:"+upd);
        if (upd.equals("更新") == true && upd.equals("") != true)
        {
            customerService.update(customer);
        }
        //String del = request.getParameter("update");
        //System.out.println("del--------- is:"+del);
        if (upd.equals("删除") == true && upd.equals("") != true)
        {
            customerService.delete(customer.getCust_id());
        }


        request.setAttribute("customer", customer);
        return "success";
    }



    @GetMapping("/all")
    public String findAll(HttpServletRequest request) {

        List<Customer> customers = customerService.findAll();

        //model.addAttribute("customers", customers);
        request.setAttribute("customers", customers);
        return "listall";
    }





    @RequestMapping( value = "/kkk")
    public String kkk()
    {
        return "test1";
    }

    @RequestMapping( value = "/test6")
    public String test6( @ModelAttribute("kkk") Customer customer)
    {
        return "test3";
    }


}
