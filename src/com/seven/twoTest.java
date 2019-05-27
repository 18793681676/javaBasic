package com.seven;

import java.util.Scanner;

public class twoTest {
    public static void main(String[] args) {
        double iRadius;
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        iRadius =sc.nextDouble();
        if(iRadius<0){
            System.out.println("你输入的半径有误！");
        }else{
            two oYua= new two(iRadius);
            System.out.println("圆的周长为："+oYua.getLength());
            System.out.println("圆的面积为："+oYua.getArea());
    }
    }
}
