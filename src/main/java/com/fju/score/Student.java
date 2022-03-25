package com.fju.score;

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
        System.out.print(name+ "\t" + english + "\t" + math + "\t" +getave());
        if(getave()<60){
            System.out.println("*");
        }else {
            System.out.println();
        }
    }

    public int getave(){
        return (english+math)/2;
    }




}
