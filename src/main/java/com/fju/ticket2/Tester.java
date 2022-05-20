package com.fju.ticket2;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Normalperson normalperson = new Normalperson(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Student student = new Student(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        BackandForth backandForth = new BackandForth(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Old old=new Old(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        normalperson.print();
        student.print();




/*        int i = 1;
        int a=600;
        int b=900;
        int c=1500;
        boolean p = true;
        while (p){
            System.out.println("Your start station?(1: Taipei, 2: Taichung, 3: Kaohsiung)");
            String s = scanner.next();
            switch (s) {
                case "100":
                    System.out.println("Your end station?(2: Taichung, 3: Kaohsiung)");
                    int n = scanner.nextInt();
                    if (n == 200) {
                        System.out.println("Taipei to Taichung *"+i+"\t"+a+"$");
                    } else if (n == 300) {
                        System.out.println("Taipei to Kaohsiung *"+i+"\t"+c+"$");
                    }
                    break;
                case "200":
                    System.out.println("Your end station?(1: Taipei,3: Kaohsiung)");
                    int k = scanner.nextInt();
                    if (k == 100) {
                        System.out.println("Taichung to Taipei *"+i+"\t"+a+"$");
                }   else if (k == 300) {
                        System.out.println("Taichung to Kaohsiung *"+i+"\t"+b+"$");
                }
                    break;
                case "300":
                    System.out.println("Your end station?(1: Taipei, 2: Taichung,)");
                    int t = scanner.nextInt();
                    if (t == 100) {
                        System.out.println("Kaohsiung to Taipei *"+i+"\t"+c+"$");
                    } else if (t == 200) {
                        System.out.println("Kaohsiung to Taichung *"+i+"\t"+b+"$");
                    }
                    break;
                default:
                    p = false;
                    break;
            }
        }*/


    }

}
