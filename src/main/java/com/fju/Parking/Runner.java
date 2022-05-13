package com.fju.Parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String enterTime = "8:00";
        String exitTime = "11:17";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try {
             d= sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            int mins = (int)(d2.getTime()- d.getTime())/1000/60;
            int price = 30*(mins/60);
            int a = mins%60;
            if(a<15){
                System.out.println(price);
            }else {
                System.out.println(price+30);
            }

            if(a<15){
                System.out.println(price);
            }else if (a>15 && a<30){
                System.out.println(price+15);
            }else {
                System.out.println(price+30);
            }
        }catch (Exception e){
            System.out.println("wrong format");
        }
    }
}
