package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pid", referencedColumnName = "pid")
    private Customer pid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vin", referencedColumnName = "vin")
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

    public Customer getPid() {
        return pid;
    }

    public void setPid(Customer pid) {
        this.pid = pid;
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
                ", pid=" + pid +
                ", vin=" + vin +
                ", price=" + price +
                ", date_of_purchase=" + date_of_purchase +
                '}';
    }
}
