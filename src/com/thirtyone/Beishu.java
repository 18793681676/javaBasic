package com.thirtyone;
import java.util.Scanner;
public class Beishu {
    public static void main(String[] args) {
        System.out.println("请输入第一个数");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = input.nextInt();
        int m = deff(num1, num2); // 调用deff函数
        System.out.println("最大公约数：" + m);
        int n = num1 * num2 / m; // 通过最大公约数能直接得到最小公倍数
        System.out.println("最小公倍数：" + n);

    }

    public static int deff(int num1, int num2) {
        if (num1 < num2) // 如果第一个数小于第二个数
        {
            int a; // 通过一个数进行交换位置
            a = num2;
            num2 = num1;
            num1 = a;
        }
        while (num2 != 0) // 当第二个数不等于零的事情，循环
        {
            if (num1 == num2) // 如果第一个数和第二个数相等
            {
                return num1; // 则第一个数就是最大公约数
            } else {
                int b = num1 % num2;
                num1 = num2;
                num2 = b;
            }
        }
        return num1;
    }
}