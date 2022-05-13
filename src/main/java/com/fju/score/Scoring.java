package com.fju.score;

import java.util.ArrayList;
import java.util.List;
//修飾字(子) Modifier  public/default(package)/private/protected(子)
public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("amy",59,60));
        students.add(new Student("joe",80,80));
        students.add(new GraduateStudent("jan",75,80,65));

        for (Student s : students){
            s.print();
        }

    }
}