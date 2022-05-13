package com.fju.sales;

public class Customer {
    String id;
    int price;
    float off = 0.1f;

    public Customer(String id,int price){
        this.id=id;
        this.price=price;
    }
    public float reduce(){
        return (price/1000)*off*1000;
    }
    public void print(){
        System.out.println(id+"\t"+price+"\t"+(price-reduce()));
    }
}
