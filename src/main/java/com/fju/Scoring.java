package com.fju;

public class Scoring {
    public static void main(String[] args) {

        Student amy = new Student("amy ",59,60);
        Student you = new Student("you ",80,80);
        GraduateStudent jane = new GraduateStudent("jane",75,80,65);
        jane.print();
        amy.print();
        you.print();

    }
}