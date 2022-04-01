package com.fju.sales;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",2000));
        customers.add(new Silvercustomer("0003",2000));
        customers.add(new Goldcustomer("0004",1800));

        for (Customer c : customers){
            c.print();
        }
    /*  for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }*/
    }
}
