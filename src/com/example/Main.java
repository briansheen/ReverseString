package com.example;

public class Main {

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s){
        StringBuilder solution = new StringBuilder();
        for(int i = s.length()-1; i >= 0; --i){
            solution.append(s.charAt(i));
        }
        return solution.toString();
    }
}
