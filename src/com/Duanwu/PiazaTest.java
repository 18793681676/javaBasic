package com.Duanwu;

import java.util.Scanner;



    public class PiazaTest {
        public  void main(String[] args) {
           Scanner input = new Scanner(System.in);
            System.out.print("请输选择要制作的披萨:1.培根披萨   2.海鲜披萨");
            int num = input.nextInt();
            Piaza p=PiazaFactory.getPizza(num);
            System.out.println(p.show());
        }
    }


