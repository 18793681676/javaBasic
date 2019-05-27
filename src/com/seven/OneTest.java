package com.seven;

public class OneTest {

    public static void main(String[] args) {
        one oRec1 = new one();
        System.out.println("默认长方形的周长为：" + oRec1.getLength());
        System.out.println("默认长方形的面积为：" + oRec1.getSquare());

        one oRec2 = new one(2);
        System.out.println("默认长方形的周长为：" + oRec2.getLength());
        System.out.println("默认长方形的面积为：" + oRec2.getSquare());

        one oRec3 = new one(3);
        System.out.println("默认长方形的周长为：" + oRec3.getLength());
        System.out.println("默认长方形的面积为：" + oRec3.getSquare());
    }
}
