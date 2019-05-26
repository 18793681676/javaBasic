package com.homework;

public class one {
    /*  打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
      例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
              1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        for (a=100;a<=999;a++){
            b=a%10; //个位
            c = a%100/10;//十位
            d = a/100;// 百位
            // =  赋值符号   ==  等于符号
            if (a==Math.pow(b,3)+Math.pow(c,3)+Math.pow(d,3)){   //Math.pow(x,n)  x的n次方
                System.out.println(a);
        }
        }
    }
}
