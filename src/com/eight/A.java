package com.eight;

public class A {
  /*
    CreatePerson p1 = new CreatePerson();
    p1.s*/

    public static void main(String[] args) {

        Point p1 = new Point(1,2);
        p1.movePoint(3,5);
        System.out.println(p1);
        Point p2 = new Point(-1,-5);
        p2.movePoint(5,7);
        System.out.println(p2);
    }
}
