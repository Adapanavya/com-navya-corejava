package com.navya.corejava.monthNames;

import java.lang.invoke.CallSite;
import java.util.Scanner;

public class Months {
    public static void main(String[] args){
        System.out.println("Enter the character to which month you want:");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        switch (c){
            case 'j':
            System.out.println("January");
            break;
            case 'f':
                System.out.println("February");
                break;
            case 'm':
                System.out.println("March");
                break;
            case 'a':
                System.out.println("April");
                break;
            case 'y':
                System.out.println("May");
                break;
            case 'u':
                System.out.println("June");
                break;
            case 'l':
                System.out.println("July");
                break;
            case 'g':
                System.out.println("August");
                break;
            case 's':
                System.out.println("September");
                break;
            case 'o':
                System.out.println("October");
                break;
            case 'n':
                System.out.println("November");
                break;
            default:
                System.out.println("no result found");

        }
    }
}
