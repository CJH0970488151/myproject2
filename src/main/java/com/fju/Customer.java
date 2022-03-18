package com.fju;



public class Customer {
    int spend;
    String id;
    float off = 0.1f;
    public Customer(String id,int spend){
        this.id = id;
        this.spend =spend;
    }

    public void print(){
        int n = (spend/1000)*100;
        System.out.println(id + "\t" + spend + "\t" + (spend-n)) ;
    }


    }









