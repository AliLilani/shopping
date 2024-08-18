package com.group13.shopping.model;
import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private float price;

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
        this.price=price;
    }

}
