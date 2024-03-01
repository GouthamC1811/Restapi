package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long billno;
    
    String productname;
    int Quantity;
    int price;
    int totalbill;
    public Long getBillno() {
        return billno;
    }
    public void setBillno(Long billno) {
        this.billno = billno;
    }
    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getTotalbill() {
        return totalbill;
    }
    public void setTotalbill(int totalbill) {
        this.totalbill = totalbill;
    }
    

}