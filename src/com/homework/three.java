package com.homework;
public class three {
   /* 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？
    都是多少？
            1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。
    组成所有的排列后再去 掉不满足条件的排列。*/
   public static void main(String[] args) {
       int a = 0;
       for (int b = 1;b<=4;b++){  //百位可能的数字 1 2 3 4
           for (int c=1;c<=4;c++){//十位可能的数字 1 2 3 4
               for (int d=1;d<=4;d++){ //个位可能的数字   1 2 3 4
                   if (b!=c&&b!=d&&c!=d){  //每一位数字不相同
                       a++;
                       System.out.println(b*100+c*10+d);
                   }
               }
           }
       }
       System.out.println("共有"+a+"个数字");
   }
}