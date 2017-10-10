package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter a number");
        int m=keyboard.nextInt();
        int count=1;
        System.out.print(count);
        count++;
        while(count <= m){
            String var=", "+count;
            System.out.print(var);
            count++;
        }
    }
}
