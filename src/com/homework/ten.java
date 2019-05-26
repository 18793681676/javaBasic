package com.homework;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {

        /*一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。*/
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
       int b = 0;
       int c=a;

       while(a%10>0){
          b +=a%10;
          a=a/10;
       }
      b=a+b;
       if (b%9==0){
           System.out.println(c+"能被9整除");
       }else {
           System.out.println(c+"不能被9整除");
       }



    }
}
