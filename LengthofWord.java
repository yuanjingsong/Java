package com.company;

import java.util.Scanner;

/**
 * Created by yuanjingsong on 2017/4/8.
 */
public class LengthofWord {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] array = new int[s.length()] ;
        int temp = 0;
        int j = 0;
        if(s.charAt(j) == '.'){
        }
        else {
            for (int i = 0; i < s.length() && s.charAt(i) != '.'; i++) {
                if (s.charAt(i) != ' ') {
                    temp++;
                } else if (s.charAt(i) == ' ' && temp != 0) {
                    array[j++] = temp;
                    temp = 0;
                }
            }
            if (temp != 0) {
                array[j] = temp;
            }
            int i = 0;
            if (array[i] == 0) {

            } else {
                while (array[i] != 0 && array[i + 1] != 0) {
                    System.out.print(array[i++] + " ");
                }
                System.out.print(array[i]);
            }
        }
    }
}

