package com.tekpro10.GenericCrud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String productName;
    private String productType;
    private int stock;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setCarName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public double getPrice() {
        return price;
    }

    public void setProce(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InventoryEntity{" +
                "ID Product =" + id +
                ", Product Name ='" + productName + '\'' +
                ", Product Type ='" + productType + '\'' +
                ", Stock ='" + stock + '\'' +
                ", Price ='" + price + '\'' +
                '}';
    }
}
