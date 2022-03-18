package com.fju;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Silvercustomer c2 = new Silvercustomer("0002",1100);
        Goldcustomer c3 = new Goldcustomer("0003",1500);
        c1.print();
        c2.print();
        c3.print();
    }
}
