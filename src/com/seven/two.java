package com.seven;

public class two {
    private double radius;
    public two(double dRadius){
        this.radius=dRadius;
    }
    public double getLength(){
        return 2*Math.PI*this.radius;
    }
    public double getArea(){
        return  Math.PI*this.radius*this.radius;
    }


}
