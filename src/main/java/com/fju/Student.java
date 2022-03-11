package com.fju;

public class Student {
    String name;
    int math;
    int english;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name,int english,int math){
        this(name);
        //this.name = name;
        this.english = english;
        this.math = math;

    }
    public Student(){
        this("k",-1,-1);
        //name = "k";
        //english = -1;
        //math = -1;
    }

    public void print(){
        int ave = (english+math)/2;
        System.out.print(name+ "\t" + english + "\t" + math + "\t" +ave );
        if(ave<60){
            System.out.println("*");
        }else {
            System.out.println();
        }
    }




}
