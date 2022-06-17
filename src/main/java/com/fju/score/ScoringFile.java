package com.fju.score;

import java.io.*;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null){
                String[] token = line.split(",");
                String name = token[0];
                int math = Integer.parseInt(token[1]);
                int english = Integer.parseInt(token[2]);
                Student student = new Student(name,math,english);
                student.print();
                line = reader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("檔案讀取錯誤");
        }catch (IOException e){
            System.out.println("資料讀取錯誤");
        }
        System.out.println("Testing");
    }
}
