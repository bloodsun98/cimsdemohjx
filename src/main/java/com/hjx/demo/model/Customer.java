package com.hjx.demo.model;

public class Customer {
    public String getCust_id() {
        return cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getCust_type() {
        return cust_type;
    }

    public String getCust_no() {
        return cust_no;
    }

    public String getCust_birth() {
        return cust_birth;
    }

    public String getCust_home() {
        return cust_home;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public String getCust_email() {
        return cust_email;
    }

    public String getCust_status() {
        return cust_status;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public void setCust_type(String cust_type) {
        this.cust_type = cust_type;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public void setCust_birth(String cust_birth) {
        this.cust_birth = cust_birth;
    }

    public void setCust_home(String cust_home) {
        this.cust_home = cust_home;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public void setCust_status(String cust_status) {
        this.cust_status = cust_status;
    }
    private String cust_id; //   客户号
    private String cust_name; // 客户姓名
    private String cust_type; //证件类型
    private String cust_no;   //证件号
    private String cust_birth; //出生日期
    private String cust_home; //家庭住址
    private String cust_phone; //联系电话
    private String cust_email; //电子邮箱
    private String cust_status; //记录状态
}
