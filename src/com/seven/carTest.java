package com.seven;

public class carTest {

    public static void main(String[] args) {
        car aodi=new car();
        aodi.mark="奥迪";
        aodi.price=300000;
        aodi.speed=120;

        aodi.market();
        aodi.drive();
        aodi.speedChange(110);

        System.out.println("------加速---------");
        car benchi=new car();
        benchi.mark="奔驰";
        benchi.price=800000;
        benchi.speed=80;

        benchi.market();
        benchi.drive();
        benchi.speedChange(100);
    }

}
