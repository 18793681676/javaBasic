package com.homework;

public class five {
   /* 分别计算1-100之间的奇数和 和偶数和*/
    public static void main(String[] args) {
        int odd=0;  //奇数
        int  even=0;  //偶数
        for (int i = 1;i<=100;i++){
            if (i%2==0){
                even= even+i;

            }else{
                odd=odd+i;
            }

        }
        System.out.println("1-100间的偶数和为"+even);
        System.out.println("1-100间的奇数和为"+odd);


    }
}
