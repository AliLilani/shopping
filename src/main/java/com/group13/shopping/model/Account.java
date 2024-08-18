package com.group13.shopping.model;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column
    private String address;

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
    public String getAddress(){
        return this.address;
    }
    public void setPrice(String address){
        this.address=address;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
}
