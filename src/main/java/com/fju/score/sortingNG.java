package com.fju.score;

import java.util.ArrayList;
import java.util.List;

public class sortingNG {
    public static void main(String[] args) {

        String[] name = {"amy" , "you" , "are"};
        int[] math = {60,70,80};
        int[] english = {60,80,90};
        for (int i = 0; i < math.length; i++) {
            System.out.print(name[i]+" ");
            System.out.print(math[i]+" ");
            System.out.print(english[i]+" ");
            System.out.print((math[i]+english[i])/2);
            System.out.println();
        }






    }
}
