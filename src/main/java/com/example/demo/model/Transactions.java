package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import com.example.demo.model.Customer;

@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "pid")
    private Customer cust_id;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "vin", referencedColumnName = "vin")
    private Car vin;
    private Integer price;
    private Date date_of_purchase;

    public Transactions() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Customer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Customer cust_id) {
        this.cust_id = cust_id;
    }

    public Car getVin() {
        return vin;
    }

    public void setVin(Car vin) {
        this.vin = vin;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(Date date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "tid=" + tid +
                ", cust_id=" + cust_id +
                ", price=" + price +
                ", date_of_purchase=" + date_of_purchase +
                '}';
    }
}
