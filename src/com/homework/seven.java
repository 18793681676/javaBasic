package com.homework;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        /*判断一个年份是平年还是闰年*/

       /* 公历闰年的简单计算方法（符合以下条件之一的年份即为闰年）
        1.能被4整除而不能被100整除.
        2.能被400整除.*/

        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i%4==0&&i%100!=0||i%400==0){
            System.out.println(i+"是闰年");

        }else{
            System.out.println(i+"是平年");
        }
    }
}
