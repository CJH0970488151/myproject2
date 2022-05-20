package com.fju.ticket2;

import java.util.Scanner;

public class BackandForth extends Normalperson {
    public BackandForth(Station start, Station destination) {
        super(start, destination);
    }
    @Override
    public void print() {
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
                        System.out.println("Taipei to Taichung *" + 2*i + "\t" + a * 0.9 + "$" + "\t" + "來回票");
                        price+=a*0.9;
                    } else if (n == 300) {
                        System.out.println("Taipei to Kaohsiung *" + 2*i + "\t" + c * 0.9 + "$" + "\t" + "來回票");
                        price+=c*0.9;
                    }
                    break;
                case "200":
                    System.out.println("Your end station?(1: Taipei,3: Kaohsiung)");
                    int k = scanner.nextInt();
                    if (k == 100) {
                        System.out.println("Taichung to Taipei *" + 2*i + "\t" + a * 0.9 + "$" + "\t" + "來回票");
                        price+=a*0.9;
                    } else if (k == 300) {
                        System.out.println("Taichung to Kaohsiung *" + 2*i + "\t" + b * 0.9 + "$" + "\t" + "來回票");
                        price+=b*0.9;
                    }
                    break;
                case "300":
                    System.out.println("Your end station?(1: Taipei, 2: Taichung,)");
                    int t = scanner.nextInt();
                    if (t == 100) {
                        System.out.println("Kaohsiung to Taipei *" + 2*i + "\t" + c * 0.9 + "$" + "\t" + "來回票");
                        price+=c*0.9;
                    } else if (t == 200) {
                        System.out.println("Kaohsiung to Taichung *" + 2*i + "\t" + b * 0.9 + "$" + "\t" + "來回票");
                        price+=b*0.9;
                    }
                    break;
                default:
                    System.out.println("Total price:"+price);
                    p = false;
                    break;
            }

        }
    }
}
