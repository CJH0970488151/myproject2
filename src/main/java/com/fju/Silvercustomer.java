package com.fju;

public class Silvercustomer extends Customer {

    public Silvercustomer(String id, int spend){
        super(id, spend);
    }
    @Override
    public void print(){
        int n = (spend/1000)*100 ;
        System.out.println(id + "\t" + spend + "\t" + (spend-n) + "(" +
                n + ")");

    }





}




