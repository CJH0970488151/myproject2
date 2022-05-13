package com.fju.sales;



public class SliverCustomer extends Customer {
    public SliverCustomer(String id,int price){
        super(id,price);
    }
    @Override
    public void print(){
        System.out.println(id+"\t"+price+"\t"+(price-reduce())+"("+reduce()+")");
    }
}
