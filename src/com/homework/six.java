package com.homework;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        /*一个5位数，判断它是不是回文数。
        即12321是回文数，个位与万位相同，十位与千位相同。*/

        //打印出所有的回文数
       /* int a,b,c,d,e;
        for (int i=10000;i<=99999;i++){
            a=i%10;//个位
            b=i%100/10;//十位
            c=i%1000/100;//百位
            d=i%10000/1000;//千位
            e=i/10000;//万位
            if (a==e&&b==d){
                System.out.println(i+"是回文数");
            }
        }*/
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int a,b,c,d,e;
        a=i%10;//个位
        b=i%100/10;//十位
        c=i%1000/100;//百位
        d=i%10000/1000;//千位
        e=i/10000;//万位
        if (a==e&&b==d){
            System.out.println(i+"是回文数");
        }else{
            System.out.println(i+"不是回文数");
        }
    }
}
