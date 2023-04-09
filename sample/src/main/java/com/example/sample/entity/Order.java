package com.example.sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fullorder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String ordername;

    private String buyername;

    
    private String res;

  
    private String location;

    private String date;

    private float price;
 
    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Order [order_id=" + id + ", ordername=" + ordername + ", buyername=" + buyername + ", res=" + res
                + ", location=" + location + ", date=" + date + ", price=" + price +  "]";
    }
}