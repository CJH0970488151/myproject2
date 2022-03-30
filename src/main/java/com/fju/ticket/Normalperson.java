package com.fju.ticket;

import java.util.Scanner;

public class Normalperson extends Ticket {
    int price = 0;
    int a = 600;
    int b = 900;
    int c = 1500;
    int i;
    public Normalperson(Station start, Station destination) {
        super(start, destination);
    }
    public void print() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        boolean p = true;
        while (p) {
            System.out.println("Your start station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
            String s = scanner.next();
            switch (s) {
                case "100":
                    System.out.println("Your end station?(2: Taichung, 3: Kaohsiung)");
                    int n = scanner.nextInt();
                    if (n == 200) {
                        System.out.println("Taipei to Taichung *" + i + "\t" + a  + "$" + "\t" + "一般票");
                        price += a;
                    } else if (n == 300) {
                        System.out.println("Taipei to Kaohsiung *" + i + "\t" + c  + "$" + "\t" + "一般票");
                        price += c ;
                    }
                    break;
                case "200":
                    System.out.println("Your end station?(1: Taipei,3: Kaohsiung)");
                    int k = scanner.nextInt();
                    if (k == 100) {
                        System.out.println("Taichung to Taipei *" + i + "\t" + a  + "$" + "\t" + "一般票");
                        price += a ;
                    } else if (k == 300) {
                        System.out.println("Taichung to Kaohsiung *" + i + "\t" + b  + "$" + "\t" + "一般票");
                        price += b ;
                    }
                    break;
                case "300":
                    System.out.println("Your end station?(1: Taipei, 2: Taichung,)");
                    int t = scanner.nextInt();
                    if (t == 100) {
                        System.out.println("Kaohsiung to Taipei *" + i + "\t" + c  + "$" + "\t" + "一般票");
                        price += c ;
                    } else if (t == 200) {
                        System.out.println("Kaohsiung to Taichung *" + i + "\t" + b  + "$" + "\t" + "一般票");
                        price += b ;
                    }
                    break;
                default:
                    System.out.println("Total price:" + price);
                    p = false;
                    break;
            }


        }
    }
}
