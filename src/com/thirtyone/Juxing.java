package com.thirtyone;

public class Juxing extends Shape{
    private double width;
    private double height;
    Juxing(double w,double h){
        width=w;
        height=h;
    }
    public void zhouchang(){
        setL(2*(width+height));
    }
}
