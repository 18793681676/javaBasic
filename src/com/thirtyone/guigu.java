package com.thirtyone;

import java.util.Scanner;

public class guigu{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个数");
        int a=sc.nextInt();
        int a1=0;
        for(;;){
            if(a%2==0){
                a1=a/2;
            }else{
                a1=a*3+1;
            }  a=a1;
            System.out.println(a);
            if(a==1)break;
        }
    }

}
