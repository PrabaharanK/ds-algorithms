package com.test;

public class Program1 {
    public static void main(String[] args) {
        int a=10;
        if(a++==10 && --a==9){
            System.out.println("inside if, a="+a);
        }
        System.out.println("outside if, a="+a);
    }
}
