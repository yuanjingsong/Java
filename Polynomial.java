package com.company;

import java.util.Scanner;


public class Polynomial  {
    public static void main(String[] args) {
        int a;
        int [][] array = new int[101][2];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 2 ;i++){
            a = in.nextInt();
           for(int j = 1 ; j < array.length; j++){
               array[a][0] = a;
               int c = in.nextInt();
               array[a][1]  += c;
               if(a == 0){
                   break;
               }
               a = in.nextInt();
           }
        }
        int j = 100;
        for(int i = 100; i >= 1; i--) {
            if(array[i][1] != 0){
               j--;
            }
            if(array[i][1] > 0 && j!= 99 ){
                System.out.print("+");
            }
            if (array[i][1] != 0) {
                if (array[i][0] != 1 && array[i][1] != 1 && array[i][1] != -1) {
                    System.out.print(array[i][1] + "x" + array[i][0]);
                } else if (array[i][0] != 1 && array[i][1] == 1) {
                    System.out.print("x" + array[i][0]);
                }else if(array[i][0] != 1 && array[i][1] == -1){
                    System.out.print("-x" + array[i][0]);
                }
                else if (array[i][0] == 1 && array[i][1] != 1) {
                    System.out.print(array[i][1] + "x");
                } else if (array[i][0] == 1 && array[i][1] == 1) {
                    System.out.print("x");
                }
            }
        }
            if (array[0][1] != 0 && j != 100)
                System.out.print("+" + array[0][1]);
            else if(j == 100){
                System.out.print(array[0][1]);
            }
    }
}
