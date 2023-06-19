package com.example.demo.model;

public class ProductDetails {

    private String pid;
    private String description;
    private Integer price;
    private Integer shipped_quantity;

    public ProductDetails() {
    }

    public ProductDetails(String pid, String description, Integer price, Integer shipped_quantity) {
        this.pid = pid;
        this.description = description;
        this.price = price;
        this.shipped_quantity = shipped_quantity;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getShipped_quantity() {
        return shipped_quantity;
    }

    public void setShipped_quantity(Integer shipped_quantity) {
        this.shipped_quantity = shipped_quantity;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "pid='" + pid + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", shipped_quantity=" + shipped_quantity +
                '}';
    }
}
