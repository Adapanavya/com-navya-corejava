package com.java.practice.alternateChar;

public class Alternate {
    public static void main(String[] args){
        String s="Nagalaxmi";
        for(int i=0;i<s.length();i+=2) {
            System.out.println(s.charAt(i));
        }
    }
}
