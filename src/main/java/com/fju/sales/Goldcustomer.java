package com.fju.sales;

public class Goldcustomer extends Customer {

    public Goldcustomer(String id, int spend){
        super(id, spend);
    }
    @Override
    public void print() {
        int n = (spend / 1000) * 100;
        System.out.println(id + "\t" + spend + "\t" + (spend -(2*n)) + "(" +
                n + ")");

    }
}

