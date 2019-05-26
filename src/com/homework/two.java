package com.homework;

import java.util.Scanner;

public class two {
    /*题目：利用条件运算符的嵌套来完成此题：
    学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
            60分以下 的用C表示。*/
    public static void main(String[] args) {
        //控制台输入
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a>=90){
            System.out.println("A");
        }else if (a<=89&&a>=60){
            System.out.println("B");
        }else if (a<60){
            System.out.println("C");
        }


    }
}
