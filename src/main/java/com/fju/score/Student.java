package com.fju.score;

public class Student implements Printable{
    public String name;
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


@Override
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
