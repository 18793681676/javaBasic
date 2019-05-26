package com.neuedu;

public class test {
    public static void main(String[] args) {
        int a = 156;
        int b = 0;
        while (a != 0) {
            b=a%10;
            System.out.println(b);
            a=a/10;

        }
    }
}
